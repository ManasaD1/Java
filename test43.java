import java.util.Scanner;

public class test43 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==================================");
            System.out.println("   COMPLEX LOOP DEMONSTRATION     ");
            System.out.println("==================================");
            System.out.println("1. Bubble Sort Algorithm");
            System.out.println("2. Pascal's Triangle Generator");
            System.out.println("3. Fibonacci Sequence Array");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");

            choice = scanner.nextInt();
            System.out.println("==================================");

            switch (choice) {
                case 1:
                    int[] unsortedArray = { 64, 34, 25, 12, 22, 11, 90, 45, 1, 88 };
                    int n = unsortedArray.length;

                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (unsortedArray[j] > unsortedArray[j + 1]) {
                                int temp = unsortedArray[j];
                                unsortedArray[j] = unsortedArray[j + 1];
                                unsortedArray[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Sorted Array:");
                    for (int value : unsortedArray) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int triangleRows = 6;

                    for (int i = 0; i < triangleRows; i++) {
                        for (int space = 0; space < triangleRows - i; space++) {
                            System.out.print(" ");
                        }

                        int number = 1;
                        for (int j = 0; j <= i; j++) {
                            System.out.print(number + " ");
                            number = number * (i - j) / (j + 1);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int limit = 15;
                    long[] fibonacci = new long[limit];

                    if (limit > 0)
                        fibonacci[0] = 0;
                    if (limit > 1)
                        fibonacci[1] = 1;

                    int index = 2;
                    while (index < limit) {
                        fibonacci[index] = fibonacci[index - 1] + fibonacci[index - 2];
                        index++;
                    }

                    System.out.println("First " + limit + " Fibonacci Numbers:");
                    for (long num : fibonacci) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
