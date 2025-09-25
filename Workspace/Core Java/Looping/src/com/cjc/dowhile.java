package com.cjc;

import java.util.Scanner;

public class dowhile {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	num=sc.nextInt();
	do
	{
		System.out.println(num+"");
		++num;
	}
	while(num<=10);
}
}
