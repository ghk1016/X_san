package com.bawei.day1031lx.er_er;

public class BankCard {
	String name;
	int id;
	double money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "BankCard [name=" + name + ", id=" + id + ", money=" + money + "]";
	}
	public BankCard(String name, int id, double money) {
		super();
		this.name = name;
		this.id = id;
		this.money = money;
	}
	public BankCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
