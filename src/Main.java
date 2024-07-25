import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account s1 = new Savings_Account("Sifat","Sifat046",5000,"Savings account");
        Account s2 = new Current_Acoount("Sifat","Sifat046",5000,"Current account");
        Account s3 = new Student_Account("Sifat","Sifat046",5000,"Student account");
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose an option: ");
        System.out.println("1: Savings Account");
        System.out.println("2: Current Account");
        System.out.println("3: Student Account");
        int choose = scan.nextInt();

        switch (choose) {
            case 1:
                s1.create_new_account("Sifat", "rajib046", "Savings account");
                s1.deposit(2000);
                s1.withdraw(400);
                s1.check_balance();
                break;
            case 2:
                s2.create_new_account("Sifat", "Sifat046", "Current account");
                s2.deposit(20000);
                s2.withdraw(4040);
                s2.check_balance();
                break;
            case 3:
                s3.create_new_account("Sifat", "kilopd31046", "Student account");
                s3.deposit(200044);
                s3.withdraw(40090);
                s3.check_balance();
                break;
            default:
                System.out.println("Invalid option chosen.");
                break;
        }

        scan.close();
    }
}
