/*Q.14b) – Write a Java program to create class Employee (eno,ename,age,salary).If 
age is less than 18 then raise an exception ‘Age not valid Exception’ else display the 
record .*/
 
import java.util.Scanner;

class AgeException extends Exception
{
	public AgeException(String str)
	{
		System.out.println(str);
	}
}
public class AgeExcDemo
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your Age:");
		int age=s.nextInt();
		try
		{
			if(age<18)
				throw new AgeException("Invalid age");
			else
				System.out.println("Valid age");
		}
		catch(AgeException a)
		{
			System.out.println(a);
		}
	}
}