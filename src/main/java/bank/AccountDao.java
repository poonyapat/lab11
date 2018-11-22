package bank;

import java.util.List;

public interface AccountDao {
    void insertAccount(Account account);
    Account getOneAccount(int id);
    List<Account> getAllAccounts();
    // also update and delete accounts
    void updateAccount(int id, String name);
    void deleteAccount(int id);
}
