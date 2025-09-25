package com.cjc;

import java.util.Scanner;

public class ifelsestatement {
public static void main(String[] args) {
	int pwd;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	pwd=sc.nextInt();
	
	if(pwd==222)
	{
		System.out.println("my name=satish");
	}
	else
	{
		System.out.println("wrong! password");
	}
}
}
