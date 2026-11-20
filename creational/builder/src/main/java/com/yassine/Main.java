package com.yassine;

import com.yassine.model.AccountStatus;
import com.yassine.model.AccountType;
import com.yassine.model.BankAccount;
import com.yassine.model.Director;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account2=new BankAccount(3L,5600,"EUR",AccountType.SAVING_ACCOUNT,AccountStatus.CREATED);
        System.out.println("========== Account 2 With Constructor ============");
        System.out.println(account2.toString());

        BankAccount account = new BankAccount();
        account.setAccountId(2L);
        account.setType(AccountType.SAVING_ACCOUNT);
        account.setStatus(AccountStatus.CREATED);
        account.setCurrency("EUR");
        System.out.println("========== Account with Setters ============");
        System.out.println(account.toString());

        BankAccount bankAccount = Director.accountBuilder()
                .accountId(1L)
                .currency("EUR")
                .status(AccountStatus.CREATED)
                .type(AccountType.SAVING_ACCOUNT)
                .balance(80000)
                .build();

//        BankAccount bankAccount= BankAccount.builder()
//                .accountId(1L)
//                .currency("EUR")
//                .status(AccountStatus.CREATED)
//                .type(AccountType.SAVING_ACCOUNT)
//                .balance(80000)
//                .build();

        System.out.println("==========  BankAccount with Builder    ============");
        System.out.println(bankAccount.toString());
    }
}