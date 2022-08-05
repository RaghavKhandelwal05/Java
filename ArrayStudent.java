//Q. Write a java program to read n Students names from user, store them into the 
//        ArrayList collection. The program should not allow duplicate names. Display the 
//        names in Ascending order.



import java.util.*;
class ArrayStudent
{
	public static void main(String args[])
	{
		int i,n;
		String m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Students");
		n=sc.nextInt();
		ArrayList<String>al=new ArrayList<String>();
		for(i=0;i<n;i++)
		{
			m=sc.next();
			al.add(m);
		}
		TreeSet<String>ts=new TreeSet<String>(al);
		System.out.println(ts);
	}
}
