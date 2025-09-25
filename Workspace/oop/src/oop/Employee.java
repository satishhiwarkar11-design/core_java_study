package oop;

public class Employee {
private int id;
public void setId(int id)
{
	this.id=id;
}
public int getId()
{
	return id;
}
public static void main(String[] args) {
	Employee e=new Employee();
	
			e.setId(1);
	System.out.println(e.getId());
}
}
