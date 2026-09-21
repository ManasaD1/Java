
//print all the pairs present in the array
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printAllPairs(arr, n);
    }

    public static void printAllPairs(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}