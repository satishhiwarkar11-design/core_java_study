package com.cjc;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	int a=10,b=20,ch;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter choice");
	ch=sc.nextInt();
	
	switch(ch)
	{
	case 1: System.out.println("add:="+(a+b));
	break;
	case 2: System.out.println("sub:="+(a-b));
	break;
	case 3: System.out.println("mul:="+(a*b));
	break;
	case 4: System.out.println("div:="+(a/b));
	break;
	default:System.out.println("invaild code");
	}
}
}
