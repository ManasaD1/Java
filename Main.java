
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        setBalance(initialBalance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative. Setting balance to 0.0");
            this.balance = 0.0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1500.50);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: $" + account.getBalance());

        account.setAccountHolder("Alice Smith");
        account.setBalance(2000.75);

        System.out.println("\nUpdated Holder: " + account.getAccountHolder());
        System.out.println("Updated Balance: $" + account.getBalance());

        System.out.println("\n--- Attempting invalid modification ---");
        account.setBalance(-500.00);
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
