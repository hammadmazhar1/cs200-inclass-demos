public interface Publisher {
    void subscribe(String id, Subscriber s);
    void unsubscribe(String id, Subscriber s);    
}
