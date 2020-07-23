package by.chuvasova.devtask.banklist.dao;

import by.chuvasova.devtask.banklist.model.Client;

import java.io.IOException;

public interface ClientDao {

    Client getClientById(Integer id) throws IOException, ClassNotFoundException;
}
