package application;

import entities.Account;
import entities.SavingsAccount;

public class TestePolimorfismo {
    public static void main(String[] args) {

        //Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1021, "Bob", 1000.0, 0.01);

        //x.withdraw(50);
        y.withdraw(50);

        //System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
