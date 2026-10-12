public class Payroll {
    public static void main(String[] args){
        //initialize our team
        Employee[] team = new Employee[3];
        team[0] = new Employee("Max Galactica", 2026, 9, 9, 90000);

        // A Manager object can be referred using a reference to an Employee object
        team[1] = new Manager("Russell Berry", 2018, 1, 1, 120000, 3000);
        team[2] = new Employee("Moe Burns", 2019, 1,1,100000);

        for (int i = 0; i < 3; i++){
            Employee e = team[i];
            // Java will select the appropriate method definition based on the actual class of the object
            System.out.println(e.getName() +": " + e.getSalary());
        }
    }
}
