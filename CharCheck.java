import java.io.*;
class CharCheck
{
	public static void main(String args[])
	{
		int i;
		try
		{
			FileReader fr= new FileReader("c:/java/bca.txt");
			FileWriter fw=new FileWriter("c:/java/bca1.txt");
			while((i=fr.read())!=-1)
			{
				char ch=(char)i;
				if(Character.isLowerCase(ch))
				{
					System.out.println(ch+ " "+"is a letter and lower case");
					ch=Character.toUpperCase(ch);
					fw.write(ch);
				}
				else if(Character.isUpperCase(ch))
				{
					System.out.println(ch+" "+"is a letter and upper case");
					ch=Character.toLowerCase(ch);
					fw.write(ch);
				}
				else if(Character.isDigit(ch))
				{
					System.out.println(ch+" "+"is a Digit");
					fw.write(ch);
				}
				else if(Character.isWhitespace(ch))
				{
					System.out.println(ch+"is a White space");
					fw.write(ch);
				}
			}
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("Execption caught"+e.getMessage());
		}
		finally
		{
			System.out.println("Successful");
		}
	}
}