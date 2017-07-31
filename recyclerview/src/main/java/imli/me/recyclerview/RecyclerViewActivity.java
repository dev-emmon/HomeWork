package imli.me.recyclerview;

import android.support.v4.app.Fragment;

import imli.me.division.DivisionActivity;
import imli.me.recyclerview.example.ExampleFragment;
import imli.me.recyclerview.work.WorkFragment;

/**
 * Created by Doots on 2017/7/31.
 */

public class RecyclerViewActivity extends DivisionActivity {
    @Override
    protected Fragment createFragmentExample() {
        return ExampleFragment.newInstance();
    }

    @Override
    protected Fragment createFragmentWork() {
        return WorkFragment.newInstance();
    }
}
