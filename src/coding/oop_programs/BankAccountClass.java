package coding.oop_programs;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount <= balance) balance -= amount; }
}

public class BankAccountClass {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", 5000);
        account.deposit(1000);
        account.withdraw(500);
        System.out.println(account.getBalance());
    }
}
