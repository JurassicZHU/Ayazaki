import java.util.*;

public class Shop {
    ArrayList<Game> gameList;
    ArrayList<Game> shoppingcart;
    public Shop(){
        gameList = new ArrayList<Game>();
        shoppingcart = new ArrayList<Game>();
    }
    public void addToLibrary(Game game){
        gameList.add(game);
    }
    public void addToCart(Game game){
        shoppingcart.add(game);
    }
    public double checkout(){
        double total = 0;
        for(Game game : shoppingcart){
            if(game.getDiscountStrategy() != null){
                total += game.getDiscountedPrice();
            } else {
                total += game.getGamePrice();
            }
        }
        shoppingcart.clear();
        return total;
    }
}
