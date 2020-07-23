import by.chuvasova.devtask.banklist.dao.ClientDao;
import by.chuvasova.devtask.banklist.service.ClientDaoImpl;
import by.chuvasova.devtask.banklist.model.Client;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ClientDaoImplTest {

    @Mock
    private ClientDao clientDao;

    @InjectMocks
    private ClientDaoImpl clientDaoImpl;

    @Test
    void getClientById() throws IOException, ClassNotFoundException {
        final Integer id = 2;
        final Client client = new Client(2, "Simon", "The Cat");

        final Client expected = clientDaoImpl.getClientById(id);
        assertEquals(expected, client);
    }
}