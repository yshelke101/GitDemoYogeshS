
public class Operations 
{
	static int a=10;
	static int b=5;
	
	public int addition()
	{
		int add;
		add=a+b;
		return add;
	}
	
	public int subtraction()
	{
		int sub;
		sub=a-b;
		return sub;
	}
	
	public int multiplication()
	{
		int multi;
		multi=a*b;
		return multi;
	}
	
	public int division()
	{
		int div;
		div=a/b;
		return div;
	}
	
	public static void main(String[] args)
	{
		Operations o= new Operations();
		System.out.println("Number 1 is: "+a);
		System.out.println("Number 2 is: "+b);
		System.out.println("Addition of above numbers is: "+o.addition());
		System.out.println("Subtraction of above numbers is: "+o.subtraction());
		System.out.println("Multiplication of above numbers is: "+o.multiplication());
		System.out.println("Division of above numbers is: "+o.division());
	}
}
