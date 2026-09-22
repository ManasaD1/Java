import java.util.Scanner;

public class test20 {

    static void unique(int[] a) {

        for (int i = 0; i < a.length; i++) {

            if ((i == 0 || a[i] != a[i - 1]) &&
                    (i == a.length - 1 || a[i] != a[i + 1])) {

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