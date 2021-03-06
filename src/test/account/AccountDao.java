package account;

/**
 * Created by rajatbhatnagar on 1/20/16.
 */
public interface AccountDao {
    void createAccount(Account account);

    void updateAccount(Account account);

    void removeAccount(Account account);

    Account findAccount(String accountNo);
}
