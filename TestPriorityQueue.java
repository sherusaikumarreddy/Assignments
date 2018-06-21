import java.util.*;

public class TestPriorityQueue {
	
public static void main(String[] args) {
	PriorityQueue<String> pq= new PriorityQueue<String>();
	pq.add("tom");
	pq.add("gym");
	pq.add("jerry");
	pq.add("sam");
	pq.add("zack");

System.out.println(pq.element());
System.out.println(pq.peek());

Iterator itr =pq.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println("After change: "+pq.poll());
System.out.println("After change: "+pq.remove());


Iterator itr2= pq.iterator();
while(itr2.hasNext())
	System.out.println(itr2.next());
}
}
