
//print the occurance of each element present in the array
import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            int count = 0;
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted)
                continue;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + "-" + count);
        }

        sc.close();
    }
}