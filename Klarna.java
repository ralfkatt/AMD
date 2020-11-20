public class Klarna implements PaymentMethod {
    public String email;

    public Klarna(String email) {
        this.email = email;
    }

    public boolean makePayment(int amount) {
        return false;
    }
}