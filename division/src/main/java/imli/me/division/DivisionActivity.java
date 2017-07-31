package imli.me.division;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

/**
 * Created by Doots on 2017/7/31.
 */

public abstract class DivisionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisions);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_exa, createFragmentExample()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_work, createFragmentWork()).commit();
    }

    /**
     * 创建例子 Fragment
     * @return
     */
    protected abstract Fragment createFragmentExample();

    /**
     * 创建作业 Fragment
     * @return
     */
    protected abstract Fragment createFragmentWork();
}
