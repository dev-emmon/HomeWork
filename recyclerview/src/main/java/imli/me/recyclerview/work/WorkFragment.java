package imli.me.recyclerview.work;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Doots on 2017/7/31.
 */

public class WorkFragment extends Fragment {

    public static WorkFragment newInstance() {
        Bundle args = new Bundle();
        WorkFragment fragment = new WorkFragment();
        fragment.setArguments(args);
        return fragment;
    }

    // ============================================================================
    //
    // 在下面写入你的代码，创建一个 RecycleView
    // 支持下拉刷新，上拉加载更多
    //
    // ============================================================================

}
