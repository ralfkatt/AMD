import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;

public class UserManager {
    User user;

    public UserManager(User creator){
        this.user = creator;
    }
    public boolean updatePaymentMethod(String choice){
        Scanner myScan = new Scanner(System.in);
        switch (choice) {
            case "Swish":
                System.out.println("Enter your phone number");
                String phoneNumber = myScan.nextLine();
                this.user.paymentMethod = new Swish(phoneNumber);
                myScan.close();
                return true;
            case "CreditCard":
                System.out.println("Enter your card number");
                String cardNumber = myScan.nextLine();
                System.out.println("Enter your CVC");
                int CVC = myScan.nextInt();
                System.out.println("Enter your expiration date");
                String expDateStr = myScan.nextLine();
                try {
                    Date expDate = new SimpleDateFormat("dd/MM/yyyy").parse(expDateStr);
                    this.user.paymentMethod = new CreditCard(cardNumber, expDate, CVC);  
                } catch (java.text.ParseException e) {
                    myScan.close();
                    return false;
                } 
                myScan.close();
                return true;
            case "Klarna":
                System.out.println("Enter your email");
                String email = myScan.nextLine();
                this.user.paymentMethod = new Klarna(email);
                myScan.close();
                return true;
            default:
                myScan.close();
                return false;
            }
    }
    public boolean updatePersonalInfo(String name,String email,String address){
        this.user.name = name;
        this.user.email = email;
        this.user.address = address;
        return true;
    }

    public boolean changePassword(String newPassword){
        this.user.password = newPassword;
        return true;
    }

}
