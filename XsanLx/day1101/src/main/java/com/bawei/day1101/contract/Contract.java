package com.bawei.day1101.contract;

import com.bawei.day1101.utils.MyBean;

/*
 *author:郭昊坤
 *date:2019/11/1
 *function:*/public interface Contract {
     interface IView{
         void onDataSuccess(MyBean data);
         void onDataFail(String e);
     }
     interface IModel{
         void onData(String userId,String sessionId,IModelCallBack iModelCallBack);
         interface IModelCallBack{
             void onDataSuccess(MyBean data);
             void onDataFail(String e);
         }
     }
     interface IPresenter{
         void onDataAttach(Contract.IView iView);
         void onDataDetach();
         void onDataPresenter(String userId,String sessionId);
     }
}
