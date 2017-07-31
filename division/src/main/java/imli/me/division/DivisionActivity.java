package imli.me.division;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

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

        final ViewGroup vgExample = findViewById(R.id.fragment_exa);
        final ViewGroup vgWork = findViewById(R.id.fragment_work);
        CheckBox cbExample = findViewById(R.id.cb_example);
        CheckBox cbWork = findViewById(R.id.cb_work);
        cbExample.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vgExample.setVisibility(View.VISIBLE);
                } else {
                    vgExample.setVisibility(View.GONE);
                }
            }
        });
        cbWork.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    vgWork.setVisibility(View.VISIBLE);
                } else {
                    vgWork.setVisibility(View.GONE);
                }
            }
        });
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
