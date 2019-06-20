import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int ten = m/10;
        int rem = m%10;
        int five = rem/5;
        rem = rem%5;
        int tot = rem+five+ten;
        return tot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}

