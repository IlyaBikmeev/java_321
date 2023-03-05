package lesson_2.oop.inheritance;

/*
Модификаторы доступа: private, public, protected, package-private
 */
public class Person {
    //Поля(instance variable) и методы
    protected final String firstName;
    protected final String lastName;
    protected final int age;
    protected final int id;
    private static int COUNT = 0;


    //Конструктор (правило, как создать объект на основе данного класса)
    //Конструктор должен называться также, как класс
    //Он возвращает ссылку на созданный объект. Создание объекта: Person somePerson = new Person("Ivan", "Ivanov", 35);

    public Person(String first, String last, int age) {
        if(!isAgeCorrect(age)) {
            throw new IllegalArgumentException("Age must be correct!");
        }

        this.firstName = first;
        this.lastName = last;
        this.age = age;
        this.id = ++COUNT;
    }

    private boolean isAgeCorrect(int age) {
        return age >= 0 && age < 150;
    }

    public int getId() {
        return id;
    }

    //Методы
    public void printSomeInfo() {
        System.out.println("Hi! I'm a human. My name is " + firstName + " " + lastName + ", I'm " + age + " years old");
    }

    public static void staticMethod() {
        System.out.println("Hello, I'm static method!");
    }
}
