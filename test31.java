
//print all the substrings of length 4
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i <= s.length() - 4; i++) {
            System.out.println(s.substring(i, i + 4));
        }
    }
}