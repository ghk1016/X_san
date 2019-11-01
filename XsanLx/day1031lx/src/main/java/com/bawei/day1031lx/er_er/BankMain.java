package com.bawei.day1031lx.er_er;

import java.util.ArrayList;



public class BankMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCard b1 =new  BankCard("李建华",1,1000000);
		BankCard b2 =new  BankCard("李海斌",2,50);
		BankCard b3 =new  BankCard("刘贺",3,10);
		ArrayList<BankCard> list = new ArrayList<BankCard>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for(int i=0;i<list.size();i++){
			System.out.println(list.toString());
		}
	}

}
