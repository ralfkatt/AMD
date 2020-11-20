public class Match {
    public int status;
    public Responder responder;
    public Request request;
    public String responderFeedback;
    public String requesterFeedback;

    public Match(int status, Responder responder, Request request){
        this.status = status;
        this.responder = responder;
        this.request = request;
    }
}