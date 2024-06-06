public class CreditDiscount implements Discount {
    @Override
    public double applyDiscount(Game game) {
        System.out.println("Applying credit discount");
        return game.getGamePrice() * 0.85;
    }
    public String toString() {
        return "Credit Discount";
    }
}
