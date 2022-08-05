import java.util.*;
class Add
{
  public static void main(String[]args)
  {
    Scanner d=new Scanner(System.in);
    float x,y,z;
	System.out.println("Enter two numbers");
	x=d.nextFloat();
	y=d.nextFloat();
	z=x+y;
	System.out.println("Addition is"+z);
  }
}