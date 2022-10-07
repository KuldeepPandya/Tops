package task;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int p,r,t,i;
       System.out.println("Enter the principle:");
       p = sc.nextInt();
       System.out.println("Enter the rate:");
       r = sc.nextInt();
       System.out.println("Enter the time:");
       t = sc.nextInt();
       System.out.println("Simple Interest is:");
       System.out.println(i=p*r*t/100);
    }
}
