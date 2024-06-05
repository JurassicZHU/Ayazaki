import java.util.ArrayList;

public class Database {
    private Database instance;
    private ArrayList<Account> accountList;
    private ArrayList<Game> gameList;
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
    public void addAccount(Account account){
        accountList.add(account);
    }
    public void addGame(Game game){
        gameList.add(game);
    }
    public Account findAccount(String target){
        for(Account account : accountList){
            if(account.getAccountNumber().equals(target)){
                return account;
            }
        }
        return null;
    }
    public Game findGame(String target){
        for(Game game : gameList){
            if(game.getGameID().equals(target)){
                return game;
            }
        }
        return null;
    }
}
