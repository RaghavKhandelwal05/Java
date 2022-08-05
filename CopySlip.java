//Q.4b) – Write a java program to copy the contents of one file into the another file, while 
//copying change the case of alphabets and replace all the digits by ‘*’ in target 
//file.

import java.io.*;
class CopySlip
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("CopySlip.java");
		FileOutputStream fout=new FileOutputStream("Cop.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			if(Character.isUpperCase((char)i))
				i=Character.toLowerCase((char)i);
			else if(Character.isLowerCase((char)i))
				i=Character.toUpperCase((char)i);
			else if(Character.isDigit(i))
				i='*';
			fout.write(i);
		}
		System.out.println("Successfull");
		fin.close();
	}
}