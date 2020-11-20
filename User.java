import java.util.*;

public class User {
    public String userId;
    public String name;
    public String email;
    public String address;
    public String password;
    public PaymentMethod paymentMethod = null;
    public List<Match> currentMatches = null;

    public List<Request> currentRequests = null;

    // Constructor Declaration of Class
    public User(String name, String email, String address, String password) {
        this.userId = getUserId();
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;

    }

    // method 1
    public String getUserId() {
        return "hejhej";
    }
}
