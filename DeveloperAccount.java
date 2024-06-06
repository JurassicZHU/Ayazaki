public class DeveloperAccount extends AccountType{
    public String developerID;

    @Override
    public String getAccountType() {
        return "Developer";
    }
    public DeveloperAccount(String developerID){
        this.developerID = developerID;
    }  
}
