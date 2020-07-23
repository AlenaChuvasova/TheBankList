import by.chuvasova.devtask.banklist.dao.AccountDao;
import by.chuvasova.devtask.banklist.model.Account;
import by.chuvasova.devtask.banklist.service.AccountDaoImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AccountDaoImplTest {

    @Mock
    private AccountDao accountDao;

    @InjectMocks
    private AccountDaoImpl accountDaoImpl;

    @Test
    void getAllAccount() throws IOException, ClassNotFoundException {
        Set<Account> accounts = new TreeSet<>();
        accounts.add(new Account(1, 100000, 2));
        accounts.add(new Account(2, 111111, 4));
        accounts.add(new Account(3, 121212, 1));
        accounts.add(new Account(4, 555555, 5));
        accounts.add(new Account(5, 333333, 3));
        accounts.add(new Account(6, 444444, 4));
        accounts.add(new Account(7, 222222, 2));
        accounts.add(new Account(8, 313131, 4));
        accounts.add(new Account(9, 154511, 5));
        accounts.add(new Account(10, 888888, 2));
        accounts.add(new Account(11, 120000, 6));

        Set<Account> expected = accountDaoImpl.getAllAccounts();
        assertEquals(expected, accounts);
    }
}