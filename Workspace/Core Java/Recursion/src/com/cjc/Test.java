package com.cjc;

public class Test {
public static void main(String[] args) {
	
	Test t=new Test();
	int x=t.sum(10);
	System.out.println(x);
}
int sum(int b)
{
	if(b>0)
	{
		return b+sum(b-1);
	}
	else
	{
		return 0;
	}
}
}
