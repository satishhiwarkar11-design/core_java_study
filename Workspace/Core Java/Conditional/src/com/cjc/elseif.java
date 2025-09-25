package com.cjc;

import java.util.Scanner;

public class elseif {
public static void main(String[] args) {
	int marks;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter marks");
	marks=sc.nextInt();
	
	if(marks>=65 && marks<=100)
	{
		System.out.println("first");
	}
	else if(marks>=45 && marks<=65)
	{
		System.out.println("second");
	}
	else if (marks>=33 && marks<=45)
	{
		System.out.println("third");
	}
	else
	{
		System.out.println("fail");
	}
}
}