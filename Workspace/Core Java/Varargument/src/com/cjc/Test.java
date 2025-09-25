package com.cjc;

public class Test {
	
	
	public void m1(int...a)
	{
		
		System.out.println("var argument");
	}
	
	public void m1(int a)
	{
		System.out.println("simple");
	}
public static void main(String[] args) {
	Test t=new Test();
	t.m1();
	
	
}
}
