package lesson_2.oop;


import lesson_2.oop.inheritance.Person;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov", 26);
        person.printSomeInfo();
        System.out.println(person.getId());

        Person.staticMethod();

        Person person2 = new Person("Olga", "Petrova", 45);
        person2.printSomeInfo();

        System.out.println(person2.getId());
    }
}
