class InvalidException extends Exception {
	InvalidException(String s) {
		super(s);
	}
}

public class TestThrow {			
	private static void a() {
		int x = 50 / 0;
		System.out.println(x);

	}

	static void value(int i) throws InvalidException {

		if (i < 21) {
			throw new InvalidException("not eligible");
		} else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) throws InvalidException{

		System.out.println("Done");

		try {
			value(23);
			a();
		} catch (ArithmeticException e)

		{
			System.out.println("Exception Handled");
		} finally {
			System.out.println("finally keyword got executed");
		}
	}

}
