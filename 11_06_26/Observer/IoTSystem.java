public class IoTSystem{
    public static void main(String[] args){
        IoTManager iotDev = new IoTManager();

        Subscriber email = new EmailSubscriber("example@outlook.com");

        Subscriber push = new PushSubscriber("id:924583");
        
        iotDev.subscribe("HomeLock",email);
        iotDev.subscribe("HomeLock",push);
        iotDev.subscribe("CoffeeMachine",push);
        iotDev.subscribe("Fridge",email);

        iotDev.pushUpdate("HomeLock", "Door Unlocked");
        iotDev.pushUpdate("HomeLock","Door Locked");
        iotDev.pushUpdate("Fridge","Eggs are low");
        iotDev.pushUpdate("CoffeeMachine","Beans have expired");
    }
}