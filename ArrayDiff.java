package com.Assignment2.Assignment2;
import java.util.Scanner;
public class ArrayDiff {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lenght of the array: ");
		int length=sc.nextInt();
		int values[]= new int[length];
		
		System.out.println("enter the values: ");

		for(int i=0;i<values.length;i++)
		{
			values[i]=sc.nextInt();
		}
		int high=values[0];
		int low=values[0];
		
		for(int i=1;i<values.length;i++)
		{
			if(values[i]>high)
				high=values[i];
		}
		for(int i=1;i<values.length;i++)
		{
			if(values[i]<low)
			low=values[i];
		}
		
int difference=high-low;
System.out.println("Difference is : "+difference);
	}
}
