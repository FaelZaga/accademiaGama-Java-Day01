package main.java.com.faelzaga.classesTest;

import main.java.com.faelzaga.classesTest.entities.Account;

public class ProgramAccount {

    public static void main(String[] args) {

        Account acc01 = new Account("Rafael",1000.00);

        System.out.println(acc01);

        acc01.deposit(500.00);

        System.out.println(acc01);

        acc01.withdraw(270.00);

        System.out.println(acc01);

        System.out.println(acc01.accountIncome());
    }
}
