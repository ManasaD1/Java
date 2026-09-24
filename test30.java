
//check palindrome
import java.util.Scanner;

public class test30 {
    public boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);

        }
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        test30 obj = new test30();
        if (obj.isPalindrome(s)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");

        }
    }
}
