package com.bawei.day1101.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.day1101.R;
import com.bawei.day1101.utils.MyBean;

import java.util.List;

/*
 *author:郭昊坤
 *date:2019/11/1
 *function:*/public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
     private List<MyBean.ResultBean> myBean;
     private Context context;

    public MyAdapter(List<MyBean.ResultBean> myBean, Context context) {
        this.myBean = myBean;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.lift_layout, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof ViewHolder){
            ((ViewHolder) holder).text_xie.setText(myBean.get(position).getCategoryName());
            ((ViewHolder) holder).text_xie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    lift.lifts(position);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return myBean.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView text_xie;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_xie = itemView.findViewById(R.id.text_xie);
        }
    }
    //接口回调
    public interface Lift{
        void lifts(int i);
    }
    private Lift lift;

    public void setLift(Lift lift) {
        this.lift = lift;
    }
}
