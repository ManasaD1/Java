//reverse string
public class test13 {
    public static void main(String[] args) {
        String original = "Hello World";

        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
