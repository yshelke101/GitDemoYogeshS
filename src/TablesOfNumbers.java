import java.util.Scanner;

public class TablesOfNumbers 
{
	public static void main(String[] args) 
	{
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		j=sc.nextInt();
		
		System.out.println("Table of the number: "+j);
		
		for(i=1;i<=10;i++)
		{
			System.out.println(i*j);
		}
		
		System.out.println("Reverse Table of the number: "+j);
		
		for(i=10;i>=1;i--)
		{
			System.out.println(i*j);
		}

	}

}
