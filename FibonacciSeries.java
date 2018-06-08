
public class FibonacciSeries {

	int Initial = 1;
	int PreValue = 1;

	FibonacciSeries(int n) {
		for (int i = 0; i <= n; i++) {
			int temp = Initial;
			Initial = Initial + PreValue;
			PreValue = temp;
			System.out.println(Initial);
			if (Initial >= 100) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		new FibonacciSeries(100);
	}
}