public class Employee {

    // all attributes are private
    private String name;
    private int hireYear;
    private int hireMonth;
    private int hireDay;
    private int salary;

    public Employee(){
        name ="";
        hireYear = 2026;
        hireMonth = 1;
        hireDay = 1;
        salary = 40000;
    
    }

    public Employee(String name, int year, int month, int day, int salary){
        this.name = name;
        this.hireYear = year;
        this.hireMonth = month;
        this.hireDay = day;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHireYear(int year){
        hireYear = year;
    }
    public int getHireYear(){
        return hireYear;
    }
    public void setHireMonth(int month){
        hireMonth = month;
    }
    public int getHireMonth(){
        return hireMonth;
    }
    public void setHireDay(int day){
        hireDay = day;
    }
    public int getHireDay(){
        return hireDay;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
}