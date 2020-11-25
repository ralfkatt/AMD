// Singleton class
public class Matcher {

    private Learner learner;

    // static variable single_instance of type Singleton
    private static Matcher matcherInstance = null;

    // private constructor restricted to this class itself
    private Matcher() {
        this.learner = new Learner();
    }

    // static method to create instance of Singleton class
    public static Matcher getInstance() {
        if (matcherInstance == null)
            matcherInstance = new Matcher();

        return matcherInstance;
    }

    public Match createMatch(Request request) {
        return this.learner.createMatch(request);
    }
}
