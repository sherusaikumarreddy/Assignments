package com.Assignment3.Assignment3;
import java.io.*;
import java.util.*;
public class WordCount {
	public static void main(String[] args) throws FileNotFoundException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc =new Scanner(new File("C:\\Users\\Sai KumarReddy sheru\\Desktop\\Text.txt"));
		while(sc.hasNext())
		{
			String str = sc.next();
			if(map.containsKey(str))
			{
			 int count = map.get(str)+1;
			 map.put(str, count);
		    }
		     else {
		
			map.put(str, 1);
			
			}
			}
		
		sc.close();
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry);
		}
		
	}

}
