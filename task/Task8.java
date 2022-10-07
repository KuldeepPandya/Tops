package task;
import java.util.Scanner;

public class Task8
{
	public static void main(String[]args)
	{
		int a;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Number :");
		a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("This number is positive.");
		}
		if(a<0)
		{
			System.out.println("This number is Negative.");
		}
		if(a==0)
		{
			System.out.println("This number is Zero.");
		}
		
	}
}
