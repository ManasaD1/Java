
//sub arrays
import java.util.Scanner;

public class test22 {

    static int countSubarrays(int[] arr, int size, int k) {
        int count = 0;

        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;

            for (int j = i; j < i + size; j++) {
                sum = sum + arr[j];
            }

            if (sum == k) {
                count++;
            }
        }

        return count;
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
        int k = sc.nextInt();

        int result = countSubarrays(arr, size, k);

        System.out.println(result);
    }
}