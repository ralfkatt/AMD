public class Swish implements PaymentMethod {
    public String phoneNumber;

    public Swish(String PhoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public boolean makePayment(int amount) {
        return false;
    }
}