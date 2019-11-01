package com.bawei.day1031lx.er_yi;



public class Test {
	public static void main(String[] args) {
		Person p = new SouthPerson();
		Person p2 = new NorthPerson();
		Person [] arr = {p,p2};
		for (Person person : arr) {
			person.eat();
		}
	}
}
