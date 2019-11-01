package com.bawei.day1101;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.bawei.day1101.base.BaseActivity;
import com.bawei.day1101.contract.Contract;
import com.bawei.day1101.model.MyAdapter;
import com.bawei.day1101.model.MyRightAdapter;
import com.bawei.day1101.presenter.DataPresenter;
import com.bawei.day1101.utils.MyBean;

import java.util.List;

public class MainActivity extends BaseActivity implements Contract.IView {


    private static final String TAG = "MainActivity";
    private DataPresenter dataPresenter;
    private RecyclerView recy_lift;
    private RecyclerView recy_right;
    private MyAdapter myAdapter;

    @Override
    public int getlayoutid() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        dataPresenter = new DataPresenter();
        dataPresenter.onDataAttach(MainActivity.this);
        dataPresenter.onDataPresenter("7467","15725971487707467");
    }

    @Override
    public void initData() {
        recy_lift = findViewById(R.id.recy_lift);
        recy_right = findViewById(R.id.recy_right);
        recy_lift.setLayoutManager(new LinearLayoutManager(this));
        recy_right.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onDataSuccess(MyBean data) {
        final List<MyBean.ResultBean> result = data.getResult();
        myAdapter = new MyAdapter(result, this);
        recy_lift.setAdapter(myAdapter);
        myAdapter.setLift(new MyAdapter.Lift() {
            @Override
            public void lifts(int i) {
                MyRightAdapter myRightAdapter = new MyRightAdapter(MainActivity.this,result.get(i).getShoppingCartList());
                recy_right.setAdapter(myRightAdapter);
            }
        });
    }

    @Override
    public void onDataFail(String e) {

    }
}
