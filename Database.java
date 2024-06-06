import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private Database instance;
    private ArrayList<Account> accountList;
    private ArrayList<Game> gameList;
    public Database(){
        accountList = new ArrayList<Account>();
        gameList = new ArrayList<Game>();
        System.out.println("Database instance created");
    }
    public Database getInstance(){
        if(this.instance == null){
            this.instance = new Database();
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
    public void createAccount(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Enter email address: ");
        String email = sc.nextLine();
        System.out.print("Enter account type: ");
        String accountNumber = generateAccountNumber();
        Account account = new Account(username, password, email, accountNumber, sc.nextLine());
        addAccount(account);
    }
    //help me to implement a method randomly generate account number
    public String generateAccountNumber() {
        String accountNumber = "";
        for (int i = 0; i < 8; i++) {
            int randomDigit = (int) (Math.random() * 10);
            accountNumber += randomDigit;
        }
        while (findAccount(accountNumber) != null) {
            accountNumber = "";
            for (int i = 0; i < 8; i++) {
                int randomDigit = (int) (Math.random() * 10);
                accountNumber += randomDigit;
            }
        }
        return accountNumber;
    }
    public void createGame(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter game name: ");
        String gameName = sc.nextLine();
        System.out.print("Enter game type: ");
        String gameType = sc.nextLine();
        System.out.print("Enter game price: ");
        double gamePrice = sc.nextDouble();
        String gameID = generateGameID();
        Game game = new Game(gameName, gameType, gameID, gamePrice);
        addGame(game);
    }
    private String generateGameID() {
        String gameID = "";
        for (int i = 0; i < 8; i++) {
            int randomDigit = (int) (Math.random() * 10);
            gameID += randomDigit;
        }
        while (findGame(gameID) != null) {
            gameID = "";
            for (int i = 0; i < 8; i++) {
                int randomDigit = (int) (Math.random() * 10);
                gameID += randomDigit;
            }
        }
        return gameID;
    }
}
