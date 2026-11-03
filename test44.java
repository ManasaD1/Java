import java.util.Scanner;

public class test44 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuOption;

        do {
            System.out.println("\n==================================");
            System.out.println("     DATA PROCESSING SYSTEM       ");
            System.out.println("==================================");
            System.out.println("1. Binary Search Algorithm");
            System.out.println("2. String Character Counter Matrix");
            System.out.println("3. Number Base Converter (Dec to Bin)");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");

            menuOption = scanner.nextInt();
            System.out.println("==================================");

            switch (menuOption) {
                case 1:
                    int[] sortedDataset = { 3, 9, 14, 19, 24, 31, 46, 52, 66, 75, 89, 93 };
                    int targetValue = 52;
                    int leftPointer = 0;
                    int rightPointer = sortedDataset.length - 1;
                    int foundIndex = -1;

                    while (leftPointer <= rightPointer) {
                        int midPointer = leftPointer + (rightPointer - leftPointer) / 2;

                        if (sortedDataset[midPointer] == targetValue) {
                            foundIndex = midPointer;
                            break;
                        }
                        if (sortedDataset[midPointer] < targetValue) {
                            leftPointer = midPointer + 1;
                        } else {
                            rightPointer = midPointer - 1;
                        }
                    }

                    System.out.println("Target: " + targetValue);
                    if (foundIndex != -1) {
                        System.out.println("Value found at array index: " + foundIndex);
                    } else {
                        System.out.println("Value not found in dataset.");
                    }
                    break;

                case 2:
                    String[] textBlocks = { "JAVA", "LOOP", "CODE" };
                    int maxStringLength = 4;
                    char[][] characterGrid = new char[textBlocks.length][maxStringLength];

                    for (int rowIndex = 0; rowIndex < textBlocks.length; rowIndex++) {
                        String currentWord = textBlocks[rowIndex];
                        for (int columnIndex = 0; columnIndex < maxStringLength; columnIndex++) {
                            if (columnIndex < currentWord.length()) {
                                characterGrid[rowIndex][columnIndex] = currentWord.charAt(columnIndex);
                            } else {
                                characterGrid[rowIndex][columnIndex] = '-';
                            }
                        }
                    }

                    System.out.println("Generated Character Grid:");
                    for (char[] rowArray : characterGrid) {
                        for (char element : rowArray) {
                            System.out.print("[" + element + "] ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int decimalNumber = 156;
                    int initialValue = decimalNumber;
                    String binaryString = "";

                    do {
                        int remainderValue = decimalNumber % 2;
                        binaryString = remainderValue + binaryString;
                        decimalNumber = decimalNumber / 2;
                    } while (decimalNumber > 0);

                    System.out.println("Decimal Value: " + initialValue);
                    System.out.println("Binary Output: " + binaryString);
                    break;

                case 4:
                    System.out.println("Exiting software application.");
                    break;

                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (menuOption != 4);

        scanner.close();
    }
}
