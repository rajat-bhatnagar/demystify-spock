package account

/**
 * Created by rajatbhatnagar on 1/22/16.
 */
class AccountServiceImpl implements AccountService {
    private AccountDao accountDao

    AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao
    }

    @Override
    void createAccount(String accountNo) {
        accountDao.createAccount(new Account(accountNo , 0))
    }

    @Override
    void removeAccount(String accountNo) {
        Account account = accountDao.findAccount(accountNo)
        accountDao.removeAccount(account)
    }

    @Override
    void deposit(String accountNo, double amount) {
        Account account = accountDao.findAccount(accountNo)
        account.setBalance(account.getBalance() + amount)
        accountDao.updateAccount(account)
    }

    @Override
    void withdraw(String accountNo, double amount) {
        Account account = accountDao.findAccount(accountNo)
        if(account.getBalance()<0){
            throw new InsufficientBalanceException(account)
        }
        account.setBalance(account.getBalance() - amount)
        accountDao.updateAccount()
    }

    @Override
    double getBalance(String accountNo) {
        return accountDao.findAccount(accountNo).getBalance()
    }
}
