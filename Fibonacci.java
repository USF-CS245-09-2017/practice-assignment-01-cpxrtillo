public class Fibonacci extends Practice1Test {
	
	public int fibonacci (int n, String type) {
		if (type.equals("recursive")) {
			return fibonacci_recursive(n);
		}
		if (type.equals("iterative")) {
			return fibonacci_iterative(n);
		}
		return 1;
	}

	public int fibonacci_iterative(int n) {
		int[] array = new int [n+1];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i <= n; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		return array[n];
	}

	public int fibonacci_recursive(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
	}
}

