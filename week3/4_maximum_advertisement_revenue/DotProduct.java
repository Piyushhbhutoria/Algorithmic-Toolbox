import java.util.*;

public class DotProduct {
    private static long maxDotProduct(int[] a, int[] b,int n) {
        long result = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            result += (long)a[i] * b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b, n));
    }
}

