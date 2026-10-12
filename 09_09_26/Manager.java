
//base Employee class contains String name, data of hire (as ints) and salary as int
// All attributes are private.
// Also contains a getSalary() method to return the employee object's salary
public class Manager extends Employee{
    // bonus attribute
    private int bonus;


    // a default constructor
    public Manager(){
        //implicitly called if not specified, calls the relevant superclass constructor
        super(); 
        bonus = 10000;
    }

    // a constructor with parameters
    public Manager(String name, int year, int month, int day, int salary, int bonus){
        // calls the parametric constructor for the super 
        super(name, year, month, day, salary);
        this.bonus = bonus;
    }

    public int getSalary(){
        return super.getSalary() + bonus;
    }


    public static void main(String[] args){
        Manager man = new Manager();

        // will call the overriden method for the Manager class
        System.out.println(man.getSalary());
    }
}
