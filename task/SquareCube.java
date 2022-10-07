package task;

import java.util.Scanner;

public class SquareCube 
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value :");
		int b = sc.nextInt(); 
		
		System.out.println("Your value's square is "+(b*b));
		System.out.println("Your value's cube is "+(b*b*b));
	}
}
