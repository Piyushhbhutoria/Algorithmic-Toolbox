import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
	if (n <= 1)
		return n;
	long a=0,b=1,c=1,i;
	for(i=0;i<n-1;i++){
	  c=a+b;
	  a=b;
	  b=c;
	}
	return c;
  }

  public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();

	System.out.println(calc_fib(n));
  }
}
