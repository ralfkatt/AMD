import java.util.*;

public class Request {
    public String requestId;
    public String typeOfLabour;
    public String desc;
    public Date date;
    public String location;
    public int price;
    public int status;
    public Preferences requestPreference;

    // Constructor Declaration of Class
    public Request(String typeOfLabour, String desc, Date date, String location, int price, int status) {
        this.requestId = getRequestId();
        this.typeOfLabour = typeOfLabour;
        this.desc = desc;
        this.date = date;
        this.location = location;
        this.price = price;
        this.status = status;

    }

    // method 1
    public String getRequestId() {
        return "ettrequestID";
    }

    // method 1
    public String getOwner() {
        return this.requestId;
    }

    public void setPreferences(String driversLicence, Date date, int time, int duration, String commLanguage) {
        this.requestPreference = new RequestPreference(date, time, duration, commLanguage, driversLicence);
    }
}
