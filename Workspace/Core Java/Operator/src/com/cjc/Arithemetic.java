package com.cjc;

import java.util.Scanner;

public class Arithemetic {
public static void main(String[] args) {
	
	int a,b,c,ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	a=sc.nextInt();
	b=sc.nextInt();
	
	System.out.println("enter choice");
	ch=sc.nextInt();
	
	switch(ch)
	{
	
	case 1: c=a+b;
	System.out.println("addition:="+c);
	break;
	case 2: c=a-b;
	System.out.println("substraction:="+c);
	break;
	case 3: c=a*b;
	System.out.println("mul:="+c);
	break;
	case 4: c=a/b;
	System.out.println("division:="+c);
	break;
	default:System.out.println("invaild code");
	
	
	
	}
}
}
