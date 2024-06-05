
public class Account {
    String username;
    String password;
    String email;
    String accountNumber;
    AccountType accountType;
    public Account(String username, String password, String email, String accountNumber){
        this.username = username;
        this.password = password;
        this.email = email;
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
