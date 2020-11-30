import java.util.*;

public class Driver {

    public static void main(String[] args) {
        String name = "Maja";
        String email = "erik.com";
        String address = "hej";
        String password = "123";
        Requester requester = new Requester(name, email, address, password);

        requester.paymentMethod = new Klarna("erik.com");

        Request request = requester.createRequest("flytta", "mycket", new Date(2020, 11, 25), "bahamas", 1000);
        request.setPreferences("AM", new Date(2020, 11, 25), 17, 2, "bahamas");

        Matcher matcher = Matcher.getInstance();

        requester.matchRequest(request, matcher);
        Match match = requester.currentMatches.get(0);
        System.out.println("You got a match with " + match.responder.name);
        System.out.println("Meet your match in " + request.location);

        System.out.println("Please pay " + request.price + "kr");

        requester.paymentMethod.makePayment(request.price);
    }
}
