/*Q.12a) – Write a java program that displays the number of characters, lines & words 
from a file.*/

import java.io.*;
class Count
{
	public static void main(String args[])
	{
		int countc=0,countl=0,countw=0,i;
		try
		{
			FileReader fr=new FileReader("Count.java");
			while((i=fr.read())!=-1)
			{
				char ch=(char)i;
				if(Character.isLetter(ch))
					countc++;
					else
						if(Character.isWhitespace(ch))
							countw++;
						else if(ch=='.')
							countl++;
			}
			System.out.println("Total no. of characters are:"+countc);
			System.out.println("Total no. of lines are:"+countl);
			System.out.println("Total no. of Words are:"+countw);
		}
		catch(Exception e)
		{
			System.out.println("Exception ocurred!");
		}
	}
}
			
			