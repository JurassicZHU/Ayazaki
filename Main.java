import java.util.*;

class Main{
    
    public static void mainMenu(){
        Scanner sc = new Scanner(System.in);
        Database database = new Database().getInstance();
        System.out.println("1. Create Account");
        System.out.println("2. Create Game");
        System.out.println("3. Find Account");
        System.out.println("4. Find Game");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
        int choice = -100;
        while (choice != 5){
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    database.createAccount(sc);
                case 2:
                    database.createGame(sc);
                case 3:
                    String inputNum = sc.nextLine();
                    database.findAccount(inputNum);
                case 4:
                    String inputName = sc.nextLine();
                    database.findGame(inputName);
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        sc.close();
    }
    public static void main(String[] args){
        System.out.println("Hello World");
        mainMenu();
    }
    
    
}