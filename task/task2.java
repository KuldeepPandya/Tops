package task;
import java.util.Scanner;
public class task2 
{
	public static void main(String[] args)
	{
		int a,b,c,ch;
		Scanner ans = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		a = ans.nextInt();
		System.out.print("Enter the Second Number : ");
		b = ans.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		ch = ans.nextInt();
		
		switch(ch)
		{
		case 1:
			c = a + b;
			System.out.println("Addition = " + c);
			break;
		case 2:
			c = a - b;
			System.out.println("Subtraction = " + c);
			break;
		case 3:
			c = a * b;
			System.out.println("Multiplication = " + c);
			break;
		case 4:
			c = a / b;
			System.out.println("Division = " + c);
			break;
		default:
			System.out.println("Please Enter Valid choice.");
		}
	}
}
