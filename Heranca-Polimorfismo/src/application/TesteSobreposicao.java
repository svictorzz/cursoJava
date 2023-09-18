package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class TesteSobreposicao {
    public static void main(String[] args) {

        //Account acc1 = new Account(1001, "Victor", 1000.0 );
        //acc1.withdraw(200);
        //System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Carlos", 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Lucas", 1000.0, 200.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());
    }
}
