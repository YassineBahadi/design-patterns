package com.yassine.model;

/**
 * @author pc
 **/
public class BankDirector {
    public static BankAccount.AccountBuilder accountBuilder() {
        return new BankAccount.AccountBuilder();
    }
}
