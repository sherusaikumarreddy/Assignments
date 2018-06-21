package visam.com.Assignment.ArrayListVsLinkedList;

import java.util.*;



public class ArrayListVsLinkedList {
	public static void main(String args[]) {
		
	
	LinkedList<String> list = new LinkedList<String>();
	list.add("Sheru");
	list.add("Sai");
	list.add("Kumar");
	
	
	/*LinkedList<String> list2= new LinkedList<String>();
	list2.add("Reddy");
	list2.add("Ssss");
	list2.add("uuu");
	*/
	/*
	System.out.println(list);

	System.out.println(list2);*/
	
	ListIterator itr = list.listIterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());	
	
	}
	
//	ListIterator itr = list2.listIterator();
	while(itr.hasPrevious()) {
	System.out.println(itr.previous());	
	
	}
	
	
	}
}
