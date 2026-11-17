import java.util.*;
public class IoTManager implements Publisher{
    HashMap<String, ArrayList<Subscriber>> subscribers;

    public IoTManager(){
        subscribers = new HashMap<String,ArrayList<Subscriber>>();
    }
    public void subscribe(String id, Subscriber s){
        if (!subscribers.containsKey(id)){
            
            subscribers.put(id, new ArrayList<Subscriber>());
        }
        subscribers.get(id).add(s);
    }
    public void unsubscribe(String id, Subscriber s){
        if (subscribers.containsKey(id)){
            subscribers.get(id).remove(s);
        }
    }
    public void pushUpdate(String id, String state){
        if (subscribers.containsKey(id)){
            for (Subscriber s: subscribers.get(id)){
                s.update(id,state);
            }
        }
    }
}