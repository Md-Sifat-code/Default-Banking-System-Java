public class Savings_Account extends Account{
    public String account_type;
    public Savings_Account(String name, String NID_Card,double balance,String account_type){
        super(name, NID_Card,balance);
        this.account_type = account_type;
    }
    public void create_new_account(String name,String NID_Card,String account_type){
        System.out.println("The user account type is: "+account_type);
        System.out.println("The use name is: "+name);
        System.out.println("The user Nid card number is: "+NID_Card);
    }
    public double deposit(double amount){
        return balance+=amount;
    }
    public double withdraw(double amount){
        if(balance>0){
            return balance-=amount;
        }else{
            return 0;
        }
    }
    public void check_balance(){

        System.out.println("The balance is: "+balance);

    }
}
