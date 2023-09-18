package entities;

public class BankAccount {
    private String holder;
    private int number;
    private double balance;

    public BankAccount(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public BankAccount(String holder, int number, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5;
    }

    public String toString(){
        return "Account " + number + ", Holder: " + holder + ", Balance: " + String.format("%.2f", balance);
    }

}
