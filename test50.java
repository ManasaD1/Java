import java.util.Scanner;

public class test50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = 1000.0;
        double currentLevel = 0.0;
        int choice;

        while (true) {
            System.out.println("\n1. Fill Water");
            System.out.println("2. Drain Water");
            System.out.println("3. Check Water Level");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter liters to fill: ");
                double amount = scanner.nextDouble();
                if (amount < 0) {
                    System.out.println("Invalid amount.");
                } else if (currentLevel + amount > capacity) {
                    double overflow = (currentLevel + amount) - capacity;
                    currentLevel = capacity;
                    System.out.println("Tank is full! Overflowed by " + overflow + " liters.");
                } else {
                    currentLevel += amount;
                    System.out.println("Added " + amount + " liters.");
                }
            } else if (choice == 2) {
                System.out.print("Enter liters to drain: ");
                double amount = scanner.nextDouble();
                if (amount < 0) {
                    System.out.println("Invalid amount.");
                } else if (amount > currentLevel) {
                    System.out.println("Not enough water. Drained remaining " + currentLevel + " liters.");
                    currentLevel = 0;
                } else {
                    currentLevel -= amount;
                    System.out.println("Drained " + amount + " liters.");
                }
            } else if (choice == 3) {
                System.out.println("Current Level: " + currentLevel + " / " + capacity + " liters");
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
