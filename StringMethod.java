package com.Assignment3.Assignment3;
import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		String value=sc.next();
		System.out.println("enter the index value: ");
		int i = sc.nextInt();
	    String S = new String(value);
		System.out.println("character at i: "+S.charAt(i));
		System.out.println("concatination: "+S.concat("sai"));
		System.out.println("UpperCase is : "+S.toUpperCase());
		System.out.println("trim value is: "+S.trim());
		System.out.println("codepoint : " +S.codePointAt(i));
		System.out.println("legth of the value is: "+S.length());
		System.out.println("intern is :"+S.intern());
		System.out.println("prefix: "+S.startsWith("s"));
		
		
		
	}
}
