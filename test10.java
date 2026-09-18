
//to print the number of occurence of k in the array(array of n integers)
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}