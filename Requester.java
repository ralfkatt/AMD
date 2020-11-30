import java.util.*;

class Requester extends User {
    // Instance Variables
    public List<Request> currentRequests = new ArrayList<Request>();

    // Constructor Declaration of Class
    public Requester(String name, String email, String address, String password) {
        super(name, email, address, password);
    }

    // method 1
    public Request createRequest(String typeOfLabour, String desc, Date date, String location, int price) {
        Request request = new Request(typeOfLabour, desc, date, location, price, 0);
        this.currentRequests.add(request);
        return request;
    }

    public void matchRequest(Request request, Matcher matcher) {
        Match match = matcher.createMatch(request);
        super.currentMatches.add(match);
    }
}
