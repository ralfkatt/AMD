import java.util.Date;

public class CreditCard implements PaymentMethod {
    public String cardNumber;
    public Date expirationDate;
    public int CVC;

    public CreditCard(String cardNumber, Date expirationDate, int CVC) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.CVC = CVC;
    }

    public boolean makePayment(int amount) {
        return false;
    }
}