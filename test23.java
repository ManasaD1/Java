
//subarray total count
import java.util.Scanner;

public class test23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sc.close();
        }

        int size = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i <= n - size; i++) {

            int sum = 0;

            for (int j = i; j < i + size; j++) {
                sum = sum + a[j];
            }

            if (sum == k) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }
    }
}