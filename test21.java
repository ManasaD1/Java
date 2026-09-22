
import java.util.Scanner;

public class test21 {

    static void printSubarraySums(int[] arr, int size) {
        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;

            for (int j = i; j < i + size; j++) {
                sum = sum + arr[j];
            }

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sc.close();
        }

        int size = sc.nextInt();

        printSubarraySums(arr, size);
    }
}