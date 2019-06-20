import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value[] = new double[values.length];
        int i,ind;
        double v=0,high;
        for(i=0;i<values.length;i++){
            value[i]=(double)values[i]/(double)weights[i];
        }
        while(capacity>0){
            ind=0;
            high = value[ind];
            for (i = 1; i < value.length; i++) {
                if (value[i]>high){
                    high = value[i];
                    ind = i;
                }
            }
            if(value[ind] == 0)
            break;
            if (weights[ind]<capacity){
                capacity-=weights[ind];
                v+=values[ind];
            } else {
                v+=capacity*value[ind];
                capacity=0;
            }
            value[ind] = 0;
        }
        return v;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
