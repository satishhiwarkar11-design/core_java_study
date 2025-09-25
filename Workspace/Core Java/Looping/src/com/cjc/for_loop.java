package com.cjc;

import java.util.Scanner;

public class for_loop {
public static void main(String[] args) {
	
	int num;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	num=sc.nextInt();
	
	for(int i=1; i<=10; i++)
	{
		System.out.println(num*i);
	}
}
}
