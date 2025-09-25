package com.cjc;

public class B  extends A
{

	B showa()
	{
		System.out.println("welcome");
		return this;
	}
	public static void main(String[] args) {
		 B b=new B();
		 b.show();
		 b.showa();
	}
}
