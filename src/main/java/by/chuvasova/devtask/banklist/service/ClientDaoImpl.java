package by.chuvasova.devtask.banklist.service;

import by.chuvasova.devtask.banklist.ConnectionFactory;
import by.chuvasova.devtask.banklist.dao.ClientDao;
import by.chuvasova.devtask.banklist.model.Client;
import by.chuvasova.devtask.banklist.utils.DBUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDaoImpl implements ClientDao {

    private static final String GET_CLIENT_BY_ID = "SELECT * FROM client WHERE id=?";

    @Override
    public Client getClientById(Integer id) throws IOException, ClassNotFoundException {
        PreparedStatement preparedStatement = null;
        Client client = null;
        ResultSet result = null;
        Connection connection = ConnectionFactory.getConnection();
        try {
            preparedStatement = connection.prepareStatement(GET_CLIENT_BY_ID);
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();
            if (result.next()) {
                Integer clientId = result.getInt("id");
                String name = result.getString("name");
                String surname = result.getString("surname");
                client = new Client(clientId, name, surname);
            }
        } catch (SQLException e) {
            System.out.println("No Client with this ID");
            e.printStackTrace();
        } finally {
            DBUtil.close(connection);
            DBUtil.close(preparedStatement);
            DBUtil.close(result);
        }
        return client;
    }
}
