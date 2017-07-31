package imli.me.recyclerview.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import imli.me.recyclerview.R;

/**
 * Created by Doots on 2017/7/31.
 */

public class ExampleFragment extends Fragment {

    public static ExampleFragment newInstance() {
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_example, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RecyclerAdapter adapter = new RecyclerAdapter();
        final RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        // 添加首次加载数据
        adapter.addDatas(getFirstData());

        // 添加下拉刷新
        final SwipeRefreshLayout refreshLayout = view.findViewById(R.id.refresh);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        adapter.addFirstData(getRefreshData());
                        refreshLayout.setRefreshing(false);
                    }
                }, 2000);
            }
        });
    }

    private List<ItemEntity> getFirstData() {
        List<ItemEntity> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ItemEntity itemEntity = new ItemEntity();
            itemEntity.title = "测试文字 " + i;
            list.add(itemEntity);
        }
        return list;
    }

    private ItemEntity getRefreshData() {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.title = "我是刷新的文字";
        return itemEntity;
    }
}
