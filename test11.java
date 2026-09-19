//printing elements
public class test11 {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        numbers[1] = 99;
        System.out.println("Modified second element: " + numbers[1]);

        System.out.println("Array size: " + numbers.length);

        System.out.println("\n--- Printing elements using a standard for loop ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("\n--- Printing elements using an enhanced for-each loop ---");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
