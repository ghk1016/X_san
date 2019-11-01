package com.bawei.day1101.model;

import com.bawei.day1101.contract.Contract;
import com.bawei.day1101.utils.MyBean;
import com.bawei.day1101.utils.RetrofitUtil;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/*
 *author:郭昊坤
 *date:2019/11/1
 *function:*/public class DataModel implements Contract.IModel {

    private Observable<MyBean> observable;
    private Observer<MyBean> observer;

    @Override
    public void onData(String userId, String sessionId, final IModelCallBack iModelCallBack) {
        observable = RetrofitUtil.getApiServer().getdata(userId, sessionId);
        observer = new Observer<MyBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(MyBean myBean) {
                iModelCallBack.onDataSuccess(myBean);
            }

            @Override
            public void onError(Throwable e) {
                iModelCallBack.onDataFail(e.getMessage());
            }

            @Override
            public void onComplete() {

            }
        };
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
