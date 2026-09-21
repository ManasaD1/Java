
//print all pairs whose difference is equal to k
import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        printPairs(arr, n, k);
        sc.close();
    }

    public static void printPairs(int[] arr, int n, int k) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (arr[i] - arr[j] == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}