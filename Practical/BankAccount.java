public class BankAccount {
    private int account_number;
    private String customer_name;
    private int balance;

    public BankAccount(int account_number, String customer_name, int balance) {
        this.account_number = account_number;
        this.customer_name = customer_name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs" + amount + ", New balance: Rs" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrew Rs" + amount + ", New balance: Rs" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + account_number);
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Balance: Rs" + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, "Vaidik Patel",10000);
        BankAccount account2 = new BankAccount(2, "Vedant Gandhi", 2000);

        System.out.println("Original Balance\n");
        account1.displayDetails();
        account2.displayDetails();

        System.out.println("\nDesposit from 1 to 2\n");
        account1.deposit(200);
        account1.displayDetails();

        System.out.println("\nDesposit from 2 to 1\n");
        account2.withdraw(100);
        account2.displayDetails();
    }
}
