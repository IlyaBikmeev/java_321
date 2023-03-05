package lesson_2;


import lesson_2.oop.inheritance.Person;

public class InputArgumentsInMethod {
    public static void main(String[] args) {
        int someNumber = 2345;
        method(someNumber);
        System.out.println(someNumber);

        int[] someArray = {3, 4, 5, 6};
        method(someArray);
        for(int num : someArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        String str = "someString";
        method(str);
        System.out.println(str);
        Person person = new Person("Ivan", "Ivanov", 26);
    }

    public static void method(int number) {
        number++;
    }

    public static void method(int[] array) {
        array[0] = 123456;
    }

    public static void method(String str) {
        str += " otherString";
    }
}
