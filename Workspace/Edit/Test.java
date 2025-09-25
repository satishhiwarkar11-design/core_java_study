import java.util.Scanner;
class Test
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);

System.out.println("enter number");
num=sc.nextInt();

for(int i=0; i<=10; i++)
{
System.out.println(i+"*"+num+"="+i*num);
}

}}
