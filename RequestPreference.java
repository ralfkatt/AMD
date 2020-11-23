import java.util.*;

class RequestPreference extends Preferences {
    // Instance Variables
    public String driversLicence;

    // Constructor Declaration of Class
    public RequestPreference(Date date, int time, int duration, String commLanguage, String driversLicence) {
        super(date, time, duration, commLanguage);
        this.driversLicence = driversLicence;
    }
}