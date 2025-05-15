import java.util.Scanner;

public class WhileLoop 
{
	public static void main(String[] args) 
	{
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		j=sc.nextInt();
		
		System.out.println("Table of the number: "+j);
		
		i=1;
		while(i<=10)
		{
			System.out.print(i*j+" ");
			i++;
		}
		System.out.println();
		System.out.println("------------------------------");
		
		System.out.println("Reverse Table of the number: "+j);
		
		i=10;
		while(i>=1)
		{
			System.out.print(i*j+" ");
			i--;
			
		}
	}
}
