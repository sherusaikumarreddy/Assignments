class Simple{}


public class Reflection {
	public static void main(String[] args) throws ClassNotFoundException {
		Class r = Class.forName("Simple");
		System.out.println(r.getName());
	}

}
