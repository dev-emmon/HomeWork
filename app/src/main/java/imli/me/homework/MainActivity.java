package imli.me.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import imli.me.recyclerview.RecyclerViewActivity;

/**
 * Created by Doots on 2017/7/31.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_recycler_ac).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_recycler_ac:
                startAc(RecyclerViewActivity.class);
                break;
        }
    }

    private void startAc(Class<?> clz) {
        Intent intent = new Intent(MainActivity.this, clz);
        startActivity(intent);
    }
}
