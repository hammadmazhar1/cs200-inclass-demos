
public class Main {
    public static void changeEngine(Car car, int cylinders){
        car.engineCylinders = cylinders;
    }
    public static void main(String[] args){
        Car ford = new Car();
        ford.name = "Ford";
        ford.engineCylinders = 2;
        System.out.println(ford.engineCylinders);
        System.out.println("Calling changeEngine");
        changeEngine(ford,16);        
        System.out.println(ford.engineCylinders);
    }
}
