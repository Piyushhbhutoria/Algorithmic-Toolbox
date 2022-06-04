import java.util.*;
import java.io.*;

public class Partition3 {
    private static int partition3(int[] A) {
        int n = A.length;
        if (n < 3)
            return 0;
        
        int i,sum=0;
        for(i=0;i<A.length;i++)
            sum+=A[i];
        if(sum%3 != 0)
            return 0;

        if(isSubsetSum(A, n, sum / 3))
            return 1;
        else 
            return 0;
    }

    static boolean isSubsetSum(int arr[], int n, int sum) {
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;

        if (arr[n - 1] > sum)
            return isSubsetSum(arr, n - 1, sum);

        return isSubsetSum(arr, n - 1, sum) || isSubsetSum(arr, n - 1, sum - arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(partition3(A));
    }
}

