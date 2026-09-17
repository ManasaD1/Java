
// to count prime numbers of m and n

public class test8 {
    public static void main(String[] args) {

        int n = 11;
        int m = 20;

        for (int i = n; i <= m; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2) {
                System.out.println("prime numbers:" + i);
            }
        }
    }
}