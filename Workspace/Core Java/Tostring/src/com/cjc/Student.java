package com.cjc;

public class Student {
int rollno;
String name;

public String toString() {
	return "Student[Name="+name+", rollno="+rollno+"]";
}
public static void main(String[] args) {
	 Student stu=new Student();
	 stu.name="satu";
	 stu.rollno=1;
	 System.out.println(stu);
}
}
