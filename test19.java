
import java.util.Scanner;

public class test19 {

    static void unique(int[] a) {

        System.out.print(a[0] + " ");

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sc.close();

        }

        unique(a);
    }
}