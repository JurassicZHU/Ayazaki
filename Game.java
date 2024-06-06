
public class Game {
    String gameName;
    GameType gameType;
    String gameID;
    public Game(String gameName2, String gameType2, String gameID2) {
        gameName = gameName2;
        gameType = null;
        gameID = gameID2;
    }
    public String getGameID() {
        return gameID;
    }
}
