class PushSubscriber implements Subscriber{
    String pushId;
    public PushSubscriber(String id){
        pushId = id;
    }
    public void update(String id, String state){
        System.out.println(String.format("Sending push notification to %s for device %s state update to %s",pushId, id, state));
    }
}