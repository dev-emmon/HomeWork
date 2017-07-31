package imli.me.recyclerview.example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import imli.me.recyclerview.R;

/**
 * Created by Doots on 2017/7/31.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<ItemEntity> mData;

    RecyclerAdapter() {
        mData = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_example, null));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvTitle.setText(getItem(position).title);
    }

    public ItemEntity getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    /**
     * 获取 Adapter 所有数据
     * @return
     */
    public List<ItemEntity> getDatas() {
        return mData;
    }

    /**
     * 在第一格添加数据
     * @param item
     */
    public void addFirstData(ItemEntity item) {
        mData.add(0, item);
        notifyDataSetChanged();
    }

    /**
     * 在第一格批量添加数据
     * @param items
     */
    public void addFirstDatas(List<ItemEntity> items) {
        mData.addAll(0, items);
        notifyDataSetChanged();
    }

    /**
     * 在末尾添加数据
     * @param item
     */
    public void addData(ItemEntity item) {
        mData.add(item);
        notifyDataSetChanged();
    }

    /**
     * 在末尾批量添加数据
     * @param items
     */
    public void addDatas(List<ItemEntity> items) {
        mData.addAll(items);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}
