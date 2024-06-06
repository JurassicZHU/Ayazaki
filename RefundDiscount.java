public class RefundDiscount implements Discount{
    @Override
    public double applyDiscount(Game game) {
        System.out.println("Applying refund discount");
        return game.getDiscountedPrice() * 0.95;
    }
    public String toString() {
        return "Refund Discount";
    }
}
