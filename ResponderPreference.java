import java.util.*;

class ResponderPreference extends Preferences {
    // Instance Variables
    public String location;
    public String typeOfLabour;

    // Constructor Declaration of Class
    public ResponderPreference(Date date, int time, int duration, String commLanguage, String location,
            String typeOfLabour) {
        super(date, time, duration, commLanguage);
        this.location = location;
        this.typeOfLabour = typeOfLabour;
    }
}
