package com.meesho.github;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.meesho.github.base.BaseActivity;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return 0;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
