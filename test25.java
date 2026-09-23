
//rearrange array such that all 0's are present at the ending of the array
import java.util.*;

public class test25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }

        while (index < n) {
            a[index] = 0;
            index++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
