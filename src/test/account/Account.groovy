package account

/**
 * Created by rajatbhatnagar on 1/20/16.
 */
class Account {
    String accountNo
    double balance
    AccountType type = new AccountType()

    Account() {
    }

    Account(String accountNo, double amount) {
        this.accountNo = accountNo
        this.balance = amount
    }

    public boolean equals(Object object){
        if(!(object instanceof Account)){
            return false
        }
        Account account = (Account)object
        return account.accountNo.equals(account) && account.balance == balance
    }
}
