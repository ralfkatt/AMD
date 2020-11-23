import java.util.Date;

public class Responder extends User {
    public ResponderPreferences preferences = null;
    
    public Responder(String name, String email, String address, String password) {
        super(name, email, address, password);
    }
    public void setPreferences(String location, String typeOfLabour, Date date, int time, int duration, String communicationLanguage) {
        this.preferences = new ResponderPreferences(String location, String typeOfLabour, Date date, int time, int duration, String communicationLanguage)
    }
    
    public void acceptRequest() {
        
    }

}