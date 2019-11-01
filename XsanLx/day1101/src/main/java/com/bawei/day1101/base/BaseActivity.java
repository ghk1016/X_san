package com.bawei.day1101.base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bawei.day1101.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayoutid());
        initView();
        initData();
    }
    public abstract int getlayoutid();
    public abstract void initView();
    public abstract void initData();
}
