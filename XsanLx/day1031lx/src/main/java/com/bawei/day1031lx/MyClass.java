package com.bawei.day1031lx;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        //设置控制台可以输入
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("请输入用户名：");
        String next = scanner.next();
        if (next!=null){
            account.name(next);
            for (int i = 0; i < 100; i++) {
                System.out.println("1  查询，2  存钱，3  取钱，4  结束");
                int name = scanner.nextInt();
                if (name<=3){
                    switch (name){
                        case 1:
                            account.anim();
                            break;
                        case 2:
                            System.out.println("请输入您要存入的数目");
                            int anInt = scanner.nextInt();
                            account.cun(anInt);
                            account.show();
                            break;
                        case 3:
                            System.out.println("请输入您要取出的数目");
                            int asd = scanner.nextInt();
                            account.qu(asd);
                            account.show();
                            break;
                    }
                }else if (name==4){
                    System.out.println("欢迎下次光临");
                    break;
                }else {
                    System.out.println("请输入有效操作");
                }
            }
        }else {
            System.out.println("用户名不得为空");
        }
    }
}
