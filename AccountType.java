public abstract class AccountType {
    public void displayAccountType() {
        System.out.println("Account Type: " + getAccountType());
    }
    public abstract String getAccountType();
}