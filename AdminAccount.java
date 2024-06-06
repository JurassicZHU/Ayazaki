public class AdminAccount extends AccountType{
    public String adminNumber;
    
    @Override
    public String getAccountType(){
        return "Admin";
    }
    public AdminAccount(String adminNumber){
        this.adminNumber = adminNumber;
    }
    
}
