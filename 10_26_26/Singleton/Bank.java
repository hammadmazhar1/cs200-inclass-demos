// Bank is implemented as a singleton class
public class Bank{
    static Bank instance; // holds Bank instance
    // instance variables
    String name;
    
    private Bank(){
        name = "";
    }
    // method that initializes the instance and returns it in subsequent calls
    public static Bank getInstance(){
        if (instance == null){
            instance = new Bank();
        }
        return instance;
    }


    //all instance methods;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}