
public class Learner {

    public Learner() {
    }

    public Match createMatch(Request request) {
        // magically finds a suitable responder
        Responder responder = new Responder("Dave", "mail", "address", "password");

        return new Match(1, responder, request);
    }
}
