package com.Assignment2.Assignment2;
import java.util.Scanner;
public class Palindrome {
public static void main(String args[])
{
	String sou,des="";
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a string:");
	 sou=sc.nextLine();
	int l=sou.length();
for(int i=l-1;i>=0;i--) 
	des=des+sou.charAt(i);
if(sou.equals(des))
	System.out.println("Palindrome");
else
	System.out.println("Not Palindrome");
}
}