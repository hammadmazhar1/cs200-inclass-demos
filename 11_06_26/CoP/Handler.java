public interface Handler{
    void handle(Request request);
    void setHandler(Handler h);
}