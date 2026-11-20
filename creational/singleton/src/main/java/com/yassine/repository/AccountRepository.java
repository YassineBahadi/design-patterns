package com.yassine.repository;

import com.yassine.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author pc
 **/
public interface AccountRepository {
    BankAccount save(BankAccount bankAccount);
    List<BankAccount> findAll();
    Optional<BankAccount> findById(long id);
    List<BankAccount> searchAccounts(Predicate<BankAccount> predicate);
    BankAccount update(BankAccount account);
    void deleteById(long id);

}
