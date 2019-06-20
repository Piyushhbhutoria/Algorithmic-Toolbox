import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        int i=0,sum=0;
        while(sum<=n){
            sum+=i++;
            summands.add(i);
        }
        summands.remove(--i);
        sum-=i;
        summands.remove(--i);
        summands.remove(--i);
        summands.add(++i+(n-sum));
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

