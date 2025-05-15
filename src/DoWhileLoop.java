import java.util.Scanner;

public class DoWhileLoop
{
	public static void main(String[] args) 
	{
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		j=sc.nextInt();
		
		System.out.println("Table of the number: "+j);
		
		i=1;
		do
		{
			System.out.print(i*j+" ");
			i++;
			
		}while(i<=10);
		
		System.out.println();
		System.out.println("------------------------------");
		
		System.out.println("Reverse Table of the number: "+j);
		
		i=10;
		do
		{
			System.out.print(i*j+" ");
			i--;
			
		}while(i>=1);
	}
}
