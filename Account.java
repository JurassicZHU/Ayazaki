import java.util.ArrayList;

public class Account {
    String username;
    String password;
    String email;
    String accountNumber;
    AccountType accountType;
    ArrayList<Game> gameLibrary;
    public Account(String username, String password, String email, String accountNumber, String accountType){
        this.username = username;
        this.password = password;
        this.email = email;
        this.accountNumber = accountNumber;
        switch(accountType){
            case "Admin":
                this.accountType = new AdminAccount(accountNumber);
                break;
            case "Player":
                this.accountType = new PlayerAccount(accountNumber);
                break;
            case "Developer":
                this.accountType = new DeveloperAccount(accountNumber);
                break;
            default:
                this.accountType = new GuestAccount(accountNumber);
                break;
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
