import java.util.ArrayList;

public class Database {
    private Database instance;
    private ArrayList<Account> accountList;
    private Database(){
        instance = new Database();
        accountList = new ArrayList<Account>();
        System.out.println("Database instance created");
    }
    public Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    public Account findAccount(String target){
        for(Account account : accountList){
            if(account.getAccountNumber().equals(target)){
                return new Account();
            }
        }
        return null;
    }
}
