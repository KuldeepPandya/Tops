package task;

import java.util.Scanner;

public class AreaTriangle {
	
	public static void main(String[] args)
	{
		double a,l,h;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter triangle length : ");
		l = sc.nextDouble();
		System.out.print("Enter triangle height : ");
		h = sc.nextDouble();
		
		
		
		System.out.println("Triangle area is :"+(a=0.5*l*h));
	}

}
