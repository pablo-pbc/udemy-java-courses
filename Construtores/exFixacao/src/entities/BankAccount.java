package entities;

public class BankAccount {

    private String holder;
    private final int NUMBER;
    private double balance;

    public BankAccount(int number, String holder) {
        this.NUMBER = number;
        this.holder = holder;
    }

    public BankAccount(int number, String holder, double initialDeposit) {
        this.NUMBER = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return NUMBER;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount == 0) {
            balance -= amount;
        } else {
            balance -= amount + 5.0;
        }
    }

    public String toString() {
        return "Account "
                + NUMBER
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
