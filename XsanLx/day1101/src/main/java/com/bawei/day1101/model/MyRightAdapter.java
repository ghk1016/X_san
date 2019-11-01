package com.bawei.day1101.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.day1101.R;
import com.bawei.day1101.utils.MyBean;
import com.bumptech.glide.Glide;

import java.util.List;

/*
 *author:郭昊坤
 *date:2019/11/1
 *function:*/public class MyRightAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
     private Context context;
    private List<MyBean.ResultBean.ShoppingCartListBean> resultBean;

    public MyRightAdapter(Context context, List<MyBean.ResultBean.ShoppingCartListBean> resultBean) {
        this.context = context;
        this.resultBean = resultBean;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.right_layout, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder){
            ((ViewHolder) holder).text_name.setText(resultBean.get(position).getCommodityName());
            ((ViewHolder) holder).text_price.setText(resultBean.get(position).getPrice());
            Glide.with(context).load(resultBean.get(position).getPic()).into(((ViewHolder) holder).img);
        }
    }

    @Override
    public int getItemCount() {
        return resultBean.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        private final ImageView img;
        private final TextView text_name;
        private final TextView text_price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            text_name = itemView.findViewById(R.id.text_name);
            text_price = itemView.findViewById(R.id.text_price);
        }
    }
}
