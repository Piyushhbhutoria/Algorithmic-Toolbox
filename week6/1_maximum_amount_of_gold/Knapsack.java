import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, int[] w) {
      int arr[][] = new int[w.length+1][W+1];
      int i,j;
      for(i=0;i<=w.length;i++){
        for(j=0;j<=W;j++){
          if(i==0 || j==0)
            arr[i][j] = 0;
          else if(w[i-1] <= j)
            arr[i][j] = max(w[i - 1] + arr[i - 1][j - w[i-1]], arr[i - 1][j]);
          else
            arr[i][j] = arr[i - 1][j];
        }
      }
      return arr[w.length][W];
    }

    static int max(int a, int b) {
      return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

