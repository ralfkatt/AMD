public class Matcher {
    Learner learner;

    public Matcher(){
        this.learner = new Learner();
    }
    public Match createMatch(Request request){
        return this.learner.createMatch(request);
    }
}
