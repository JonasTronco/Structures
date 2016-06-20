package diagnose;

public class Simple_Recursion implements Functions {

	public int factorial (int n) {
		if (n==0) return 1;
		else return factorial(n-1)*n;
	}

	public double power (double x, int n) {
		if (n==0) return 1.0;
		else return power (x, n-1) * x;
	}
	
	public double sin_x (double x) {
		return sin_x_recursivo (x, 10);
	}

	private double sin_x_recursivo (double x, int n) {
		if (n==0) return x;
		else return sin_x_recursivo (x, n-1) + (power(-1,n)/factorial(2*n+1))*(power(x,2*n+1));
	}
		
}
