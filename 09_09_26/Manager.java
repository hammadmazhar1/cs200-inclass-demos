public class Manager extends Employee{
    // bonus attribute
    private int bonus;


    // a default constructor
    public Manager(){
        super(); //implicitly called if not specified
        bonus = 10000;
    }

    // a constructor with parameters
    public Manager(String name, int year, int month, int day, int salary, int bonus){
        super(name, year, month, day, salary);
        this.bonus = bonus;
    }

    public int getSalary(){
        return super.getSalary() + bonus;
    }


    public static void main(String[] args){
        Manager man = new Manager();

        System.out.println(man.getSalary());
    }
}
