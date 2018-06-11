package com.Assignment2.Assignment2;
import java.util.Scanner;
public class MathOper {
	public static void main(String [] args) {
 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a:" );
		int a= sc.nextInt();
		System.out.println("enter b:" );
		float b= sc.nextFloat();
		System.out.println("enter c:" );
		double c= sc.nextDouble();
		System.out.println("enter d:" );
		long d= sc.nextLong();
		System.out.println("absolute value is: " +Math.abs(a));
		System.out.println("ceiling value is: " +Math.ceil(c));
		System.out.println("exponent value is: " +Math.exp(c));
		System.out.println("floor value is: " +Math.floor(c));
		System.out.println("increment value is: " +Math.incrementExact(a));
		System.out.println("maximum value   is: " +Math.max(d,d));
		System.out.println("minimum value  is: " +Math.min(b,b));
		System.out.println("round value is: " +Math.round(b));
		System.out.println("tan value is: " +Math.tan(c));
		System.out.println("square root value is: " +Math.sqrt(c));
		
	}

}
