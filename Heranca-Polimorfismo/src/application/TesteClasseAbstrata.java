package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TesteClasseAbstrata {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Anna", 475.00, 0.01));
        list.add(new BusinessAccount(1002, "Pedro", 700.00, 600.0));
        list.add(new SavingsAccount(1003, "Carlos", 980.00, 0.02));
        list.add(new SavingsAccount(1004, "Jose", 200.00, 0.01));
        list.add(new BusinessAccount(1005, "Victor", 2000.0, 700.00));

        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total Balance: %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account acc : list){
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
