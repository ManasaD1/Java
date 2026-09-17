//to print n prime numbers
public class test9 {
    public static void main(String[] args) {

        int n = 10;
        int countPrime = 0;
        int i = 2;

        while (countPrime < n) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2) {
                System.out.println(i);
                countPrime++;
            }

            i++;
        }
    }
}
