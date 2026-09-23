
import java.util.*;

public class test27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int length = j - i + 1;

                System.out.println(length);
            }
        }
    }
}