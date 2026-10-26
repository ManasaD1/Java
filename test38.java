public class test38 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        int count = 5;
        count++;
        System.out.println("After increment: " + count);
        count--;
        System.out.println("After decrement: " + count);

        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println("Ternary result: " + result);
    }
}
