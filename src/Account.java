public class Account {
    public String name;
    public String NID_Card;
    public double balance;
    public Account(String name, String NID_Card,double balance){
        this.name = name;
        this.NID_Card = NID_Card;
        this.balance = balance;
    }
    public void create_new_account(String sifat, String sifat046, String savingsAccount){
        System.out.println("This can create a new account");
    }
    public double deposit(double amount){
        System.out.println("This will add new ammount in our account");
        return 1;
    }
    public double withdraw(double amount){
        System.out.println("This will help to withdraw money from users account");
        return 1;
    }
    public void check_balance(){

    }
}
