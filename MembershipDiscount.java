public class MembershipDiscount {
    public double applyDiscount(Game game){
        System.out.println("Applying membership discount");
        return game.getGamePrice() * 0.9;
    }
    public String toString() {
        return "Membership Discount";
    }
}
