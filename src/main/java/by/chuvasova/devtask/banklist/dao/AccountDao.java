package by.chuvasova.devtask.banklist.dao;

import by.chuvasova.devtask.banklist.model.Account;

import java.io.IOException;
import java.util.Set;

public interface AccountDao {

    Set<Account> getAllAccounts() throws IOException, ClassNotFoundException;
}
