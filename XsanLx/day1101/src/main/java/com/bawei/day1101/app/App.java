package com.bawei.day1101.app;

import android.app.Application;
import android.content.Context;

/*
 *author:郭昊坤
 *date:2019/11/1
 *function:*/public class App extends Application {
     public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
