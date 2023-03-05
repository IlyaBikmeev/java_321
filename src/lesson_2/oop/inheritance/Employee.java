package lesson_2.oop.inheritance;

public class Employee extends Person {
    protected double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("My name is " + firstName + " my salary is " + salary + " per month");
    }
}
