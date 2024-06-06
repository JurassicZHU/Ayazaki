public class Game {
    String gameName;
    GameType gameType;
    String gameID;
    Discount discountStrategy;
    double gamePrice;
    public Game(String gameName2, String gameType2, String gameID2, double gamePrice2) {
        gameName = gameName2;
        switch (gameType2) {
            case "FPS":
                gameType = new FPSGame();
                break;
            case "RPG":
                gameType = new RPGGame();
                break;
            case "Strategy":
                gameType = new StrategyGame();
                break;
            case "Action":
                gameType = new ActionGame();
                break;
            default:
                break;
        }
        gameID = gameID2;
        gamePrice = gamePrice2;
    }
    public String getGameID() {
        return gameID;
    }
    public String getGameName() {
        return gameName;
    }
    public String getGameType() {
        return gameType.getGameType();
    }
    public void displayGameType() {
        gameType.displayGameType();
    }
    public double getGamePrice() {
        return gamePrice;
    }
    public void setDiscount(Discount discount) {
        discountStrategy = discount;
    }
    public Discount getDiscountStrategy() {
        return discountStrategy;
    }
    public void displayDiscount() {
        System.out.println("Discount: " + discountStrategy.toString());
    }
    public double getDiscountedPrice() {
        return discountStrategy.applyDiscount(this);
    }
}
