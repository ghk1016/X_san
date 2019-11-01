package com.bawei.day1101.utils;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/*
 *author:郭昊坤
 *date:2019/11/1
 *function:*/public interface ApiServer {
     //http://172.17.8.100/small/order/verify/v1/findShoppingCart
    @GET("order/verify/v1/findShoppingCart")
    Observable<MyBean>getdata(@Header("userId") String userId, @Header("sessionId") String sessionId);
}
