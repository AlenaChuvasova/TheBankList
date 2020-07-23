package by.chuvasova.devtask.banklist.servlet;

import by.chuvasova.devtask.banklist.dao.AccountDao;
import by.chuvasova.devtask.banklist.service.AccountDaoImpl;
import by.chuvasova.devtask.banklist.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@WebServlet("/accounts")
public class AccountServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AccountDao accountDao = new AccountDaoImpl();
        Set<Account> accounts = null;
        try {
            accounts = accountDao.getAllAccounts();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        req.setAttribute("accounts", accounts);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/pages/accounts.jsp");
        requestDispatcher.forward(req, resp);
    }
}
