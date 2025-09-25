package com.cjc;

import java.util.Scanner;

public class whileloop {
public static void main(String[] args) {
	
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	num=sc.nextInt();
	while(num>0)
	{
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
}
