package by.chuvasova.devtask.banklist.servlet;

import by.chuvasova.devtask.banklist.dao.ClientDao;
import by.chuvasova.devtask.banklist.service.ClientDaoImpl;
import by.chuvasova.devtask.banklist.model.Client;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/client")
public class ClientServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, NumberFormatException {
        String empty = "";
        Integer id;
        if (req.getParameter("id") == empty) {
            id = Integer.parseInt(req.getParameter("id") + 0);
        } else {
            id = Integer.valueOf(req.getParameter("id"));
        }
        ClientDao clientDao = new ClientDaoImpl();
        Client client = null;
        try {
            client = clientDao.getClientById(id);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        req.setAttribute("client", client);
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/pages/client.jsp");
        requestDispatcher.forward(req, resp);
    }
}
