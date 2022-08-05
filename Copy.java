class Copy
{
	int a; String b;
	Copy()
	{
		a=200;
	    b="Raghav";
		System.out.print(a+""+b);
	}
	Copy(Copy ref)
	{
		a=ref.Copy;
		b=ref.Copy;
		System.out.print(a+" "+b);
	}
}
class print
{
	public static void main(String[] args)
	{
		Copy r=new Copy();
		Copy r1=new Copy(r);
	}
}
	
	