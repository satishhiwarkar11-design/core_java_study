package com.cjc;

public class Method {
int rollno;
String name;

public void m1(int r, String n)
{
	rollno=r;
	name=n;
}
public void display(){
	System.out.println(rollno+"\n"+name);
}
public static void main(String[] args) {
	Method m=new Method();
	m.m1(10, "satish");
	m.display();
}
{
	
}
}
