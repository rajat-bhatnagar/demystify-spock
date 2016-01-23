package account

/**
 * Created by rajatbhatnagar on 1/22/16.
 */
class InMemoryAccountDao implements AccountDao {

    private Map<String, Account> accounts

    public boolean accountExists(String accountNo){
        return accounts.containsKey(accountNo)
    }
    @Override
    void createAccount(Account account) {
        if(accountExists(account.getAccountNo())){
            throw new DuplicateAccountException()
        }
        accounts.put(account.getAccountNo(),account)
    }

    @Override
    void updateAccount(Account account) {
        if(!accountExists(account.getAccountNo())){
            throw new AccountNotFoundException()
        }
        accounts.put(account.getAccountNo(),account)
    }

    @Override
    void removeAccount(Account account) {
        if(!accountExists(account.getAccountNo())){
            throw new AccountNotFoundException()
        }
        accounts.remove(account.getAccountNo())
    }

    @Override
    Account findAccount(String accountNo) {
        if(!accountExists(accountNo)){
            throw new AccountNotFoundException()
        }
        return accounts.get(accountNo)
    }
}
