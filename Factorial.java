import java.util.*;

public class Factorial extends Practice1Test {

	public int factorial (int n, String type) {
		if (type.equals("recursive")) {
			return factorial_recursive(n);
		}
		if (type.equals("iterative")) {
			return factorial_iterative(n);
		}
		return 1;
	}

	public int factorial_iterative(int n) {
		int f = 1;
		for (int i = n; i > 0; i--) {
			f *= i;
		}
		return f;
	}

	public int factorial_recursive(int n) {
		if (n==1) {
			return n;
		}
		return n*factorial_recursive(n-1);
	}
}
