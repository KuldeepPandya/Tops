package task;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
	    int radius = sc.nextInt();
		
		System.out.println("Circle area is :");
		 System.out.println(3.14*radius*radius);
		
	}

}
