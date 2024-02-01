public class BankAccount {
    private int accountNumber;
    private String customerName;
    private double balance;

    public BankAccount(){
        this.accountNumber = 0;
        this.customerName = " ";
        this.balance = 0;
    }
    public BankAccount(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transaction(BankAccount otherAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            // Withdraw from current account
            balance -= amount;

            // Deposit into the other account
            otherAccount.balance += amount;
        }
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", customerName='" + customerName + '\'' +
                ", balance=Rs" + balance +
                '}';
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, "John Doe", 1000);
        BankAccount account2 = new BankAccount(2, "Jane Smith", 500);

        System.out.println("Original\n");
        System.out.println("Account 1 details: " + account1.toString());
        System.out.println("Account 2 details: " + account2.toString());

        System.out.println("\n");
        account1.transaction(account2, 200);

        System.out.println("Account 1 details: " + account1.toString());
        System.out.println("Account 2 details: " + account2.toString());
    }
} 