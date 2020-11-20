public class Matcher {

    public Matcher(){}

    public Match createMatch(Request request){
        return Learner.createMatch(1, responder, request);
    }
}
