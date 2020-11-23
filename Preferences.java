import java.util.*;

class Preferences {
    // Instance Variables
    public Date date;
    public int time;
    public int duration;
    public String commLanguage;

    // Constructor Declaration of Class
    public Preferences(Date date, int time, int duration, String commLanguage) {
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.commLanguage = commLanguage;
    }
}
