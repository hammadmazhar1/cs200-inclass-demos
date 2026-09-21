public class Student {
    static final String uni = "University of Northern Colorado";
    String name;

    public static void main(String[] args){
        System.out.println(Student.uni);
        // System.out.println(this.name);
        Student stu = new Student();
        System.out.println(stu.name);
    }
}
