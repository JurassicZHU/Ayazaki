public class GuestAccount extends AccountType{
    public String adminNumber;
    
    @Override
    public String getAccountType(){
        return "Guest";
    }
    public GuestAccount(String adminNumber){
        this.adminNumber = adminNumber;
    }
}
