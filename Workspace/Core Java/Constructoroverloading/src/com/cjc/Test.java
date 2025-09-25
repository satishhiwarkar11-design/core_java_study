package com.cjc;

public class Test {
int a;
String b;
double c;
Test()
{
	a=10;
	b="satish";
	c=10.50;
}
Test(int x)
{
a=x;
}

Test(String y,double z)
{
	b=y;
	c=z;
}
public static void main(String[] args) {
	Test t=new Test();
	Test t1=new Test(10);
	Test t2=new Test("s",4.5);
	
	System.out.println(t.a+t.b+t.c);
	System.out.println(t1.a);
	System.out.println(t2.b+t2.c);
}
}