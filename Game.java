public class Game {
    String gameName;
    GameType gameType;
    String gameID;
    public Game(String gameName2, String gameType2, String gameID2) {
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
    }
    public String getGameID() {
        return gameID;
    }
}
