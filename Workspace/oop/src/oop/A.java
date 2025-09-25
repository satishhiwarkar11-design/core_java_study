package oop;



public class A 
{
	public void m1()
	{
		System.out.println("parent class");
	}
	public void m1(int a)
	{
		System.out.println("int method");
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m1(10);
	}
}


