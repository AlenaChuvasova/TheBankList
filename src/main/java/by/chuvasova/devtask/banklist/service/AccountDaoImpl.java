package by.chuvasova.devtask.banklist.service;

import by.chuvasova.devtask.banklist.ConnectionFactory;
import by.chuvasova.devtask.banklist.dao.AccountDao;
import by.chuvasova.devtask.banklist.model.Account;
import by.chuvasova.devtask.banklist.utils.DBUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeSet;

public class AccountDaoImpl implements AccountDao {

    private static final String GET_ALL_ACCOUNTS = "SELECT * FROM account";
    private static Set<Account> accounts = new TreeSet<>();

    @Override
    public Set<Account> getAllAccounts() throws IOException, ClassNotFoundException {
        Statement statement = null;
        Account account;
        ResultSet result = null;
        Connection connection = ConnectionFactory.getConnection();
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(GET_ALL_ACCOUNTS);
            while (result.next()) {
                account = new Account();
                account.setId(result.getInt("id"));
                account.setAccount(result.getInt("account"));
                account.setUserId(result.getInt("userId"));
                accounts.add(account);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            DBUtil.close(connection);
            DBUtil.close(statement);
            DBUtil.close(result);
        }
        return accounts;
    }
}
