
public class Casting {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child1 c = new Child1();
		Child2 c2 = new Child2();

		Parent pc1 = new Child1();// this is upcasting... implicit(automatic)... child object is upcasted to
									// parent reference
		System.out.println("testing...\n");
		pc1.pmethod();// here we can access only parent methods... because parent reference will not
						// know methods which are new in child1 method... it only knows the methods
						// which it has
		int j = ((Child1) pc1).cmethod(); // this is downcasting... we are downcasting the prent reference to child 1
											// reference... to access child 1 methods as well as parent methods
		System.out.println("\n"+j);
		
		Parent pc2 = new Child2();  // upcasting the child to parent  by creating the reference
		((Child2)pc2).C2method();  // down casting so the parent can access the method in the child2
		
		
		
		
//		
//		
//		c.pmethod();
//		c.cmethod();
//
//		System.out.println("\n");
//
//		c2.C2method();
//		c2.cmethod();
//		c2.pmethod();
//
//		System.out.println("\n");
//
//		p.pmethod();
//
	}

}
