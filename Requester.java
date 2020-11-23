import java.util.*;

class Requester extends User {
    // Instance Variables
    private List<Request> currentRequests = null;

    // Constructor Declaration of Class
    public Requester(String name, String email, String address, String password) {
        super(name, email, address, password);
    }

    // method 1
    public void createRequest(String typeOfLabour, String desc, Date date, String location, int price) {
        Request request = new Request(typeOfLabour, desc, date, location, price, 0);
        this.currentRequests.add(request);
    }
}
