package com.bawei.day1101.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 *author:郭昊坤
 *date:2019/11/1
 *function:*/public class RetrofitUtil {
     private static ApiServer apiServer;
     private Retrofit retrofit;
     private OkHttpClient okHttpClient;
     public static ApiServer getApiServer(){
         if (apiServer==null){
             synchronized (RetrofitUtil.class){
                 if (apiServer==null){
                     apiServer = new RetrofitUtil().getRetrofit();
                 }
             }
         }
         return apiServer;
     }

    private ApiServer getRetrofit() {
         ApiServer apiServer = initRetrofit(initOkHttp()).create(ApiServer.class);
        return apiServer;
    }

    private OkHttpClient initOkHttp() {
         okHttpClient = new OkHttpClient().newBuilder()
                 .readTimeout(Constans.TIME_NAME, TimeUnit.SECONDS)
                 .writeTimeout(Constans.TIME_NAME,TimeUnit.SECONDS)
                 .connectTimeout(Constans.TIME_NAME,TimeUnit.SECONDS)
                 .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                 .retryOnConnectionFailure(true)
                 .build();
        return okHttpClient;
    }

    private Retrofit initRetrofit(OkHttpClient okHttpClient) {
         retrofit = new Retrofit.Builder()
                 .client(okHttpClient)
                 .baseUrl(Constans.BaseUrl)
                 .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                 .addConverterFactory(GsonConverterFactory.create())
                 .build();
        return retrofit;
    }
}
