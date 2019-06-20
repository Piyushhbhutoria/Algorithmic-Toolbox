import java.util.*;

public class LCM {  
  private static long lcm(long a, long b) {
    return (long)((a*b)/gcd(a,b));
  }

  private static long gcd(long a, long b) {
    if (a == 0)
      return b;
    return gcd(b % a, a);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();

    System.out.println(lcm(a, b));
  }
}
