package com.yassine;

import com.yassine.model.AccountStatus;
import com.yassine.model.AccountType;
import com.yassine.model.BankAccount;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount= BankAccount.builder()
                .accountId(1L)
                .currency("EUR")
                .status(AccountStatus.CREATED)
                .type(AccountType.SAVING_ACCOUNT)
                .balance(80000)
                .build();

        System.out.println(bankAccount.toString());
    }
}