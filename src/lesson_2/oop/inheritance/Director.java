package lesson_2.oop.inheritance;

public class Director extends Employee {
    protected String departmentName;

    public Director(String firstName, String lastName, int age, double salary, String departmentName) {
        super(firstName, lastName, age, salary);
        this.departmentName = departmentName;
    }

    public void printDirectorInfo() {
        System.out.println("My name is " + firstName + " I'm a director of " + departmentName);
    }
}
