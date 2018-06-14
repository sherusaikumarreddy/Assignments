package com.Assignment3.Assignment3;
import java.util.Scanner;
public class BinaryForm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value: ");
		int a =sc.nextInt();
		
		System.out.println("Binary form of the value is: "+Integer.toBinaryString(a));
		
	}

}
