package com.cjc;

public class Test {
public static void main(String[] args) {
	
	Student stu=new Student();
	stu.setRollno(1);
	stu.setName("satish");
	
	Address a=new Address();
	a.setAreaname("karve");
	a.setCityname("pune");
	stu.setAdr(a);
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAdr().getAreaname());
	System.out.println(stu.getAdr().getCityname());
}
}
