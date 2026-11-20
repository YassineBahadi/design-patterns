package com.yassine.model;

/**
 * @author pc
 **/
public class Director {
    public static BankAccount.AccountBuilder accountBuilder() {
        return new BankAccount.AccountBuilder();
    }
}
