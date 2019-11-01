package com.bawei.day1031lx;

import java.util.Arrays;

/*
 *author:郭昊坤
 *date:2019/10/31
 *function:*/public class Account {
     private int id;
     private String name;
     private double money;

     String [] Yh = {"id","name","money"};



    public String name(String ming){
         name=ming;
         return name;
     }
     public double cun(double qian){
         money=qian+money;
         return money;
     }
     public double qu(double qian){
         if (money>qian){
             money = money-qian;
             return money;
         }else {
             System.out.println("余额不足");
         }
         return money;
     }
     public void show(){
         System.out.println("账户余额为："+money);
     }
     public void anim(){
         System.out.println("账户名："+name+"……………………余额："+money);
     }
    public Account() {
    }
    public Account(int id, String name, double money, String[] yh) {
        this.id = id;
        this.name = name;
        this.money = money;
        Yh = yh;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String[] getYh() {
        return Yh;
    }

    public void setYh(String[] yh) {
        Yh = yh;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", Yh=" + Arrays.toString(Yh) +
                '}';
    }
}
