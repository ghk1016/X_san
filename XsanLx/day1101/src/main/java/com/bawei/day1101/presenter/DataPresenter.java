package com.bawei.day1101.presenter;

import com.bawei.day1101.contract.Contract;
import com.bawei.day1101.model.DataModel;
import com.bawei.day1101.utils.MyBean;

import java.lang.ref.WeakReference;

/*
 *author:郭昊坤
 *date:2019/11/1
 *function:*/public class DataPresenter implements Contract.IPresenter {

    private DataModel dataModel;
    private WeakReference<Contract.IView> iViewWeakReference;

    @Override
    public void onDataAttach(Contract.IView iView) {
        dataModel = new DataModel();
        iViewWeakReference = new WeakReference<>(iView);
    }

    @Override
    public void onDataDetach() {
        if (iViewWeakReference!=null){
            iViewWeakReference.clear();
            iViewWeakReference=null;
        }
    }
    public Contract.IView getView(){
        return iViewWeakReference.get();
    }

    @Override
    public void onDataPresenter(String userId, String sessionId) {
        dataModel.onData(userId, sessionId, new Contract.IModel.IModelCallBack() {
            @Override
            public void onDataSuccess(MyBean data) {
                getView().onDataSuccess(data);
            }

            @Override
            public void onDataFail(String e) {
                getView().onDataFail(e);
            }
        });
    }
}
