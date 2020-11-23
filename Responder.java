import java.util.Date;

public class Responder extends User {
    public Preferences responderPreferences = null;
    
    public Responder(String name, String email, String address, String password) {
        super(name, email, address, password);
    }
    public void setPreferences(String location, String typeOfLabour, Date date, int time, int duration, String commLanguage) {
        this.responderPreferences = new ResponderPreference(date, time, duration, commLanguage, location, typeOfLabour);
    }
    
    public void acceptRequest() {
        
    }

}