
public class test18 {
    public static void main(String[] args) {

        int n = 5;
        int[] arr = { 3, 2, 5, 7, 1 };

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