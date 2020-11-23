import java.util.*;

class ResponderPreference extends Preferences {
    // Instance Variables
    public String location;
    public String typeOfLabour;

    // Constructor Declaration of Class
    public ResponderPreference(Date date, int time, int duration, int commlanguage, String location,
            String typeOfLabour) {
        super(date, time, duration, commlanguage);
        this.location = location;
        this.typeOfLabour = typeOfLabour;
    }
}
