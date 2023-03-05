package lesson_1;

public class Example1 {
    public static void main(String[] args) {
        someMethod(0);
    }

    public static void someMethod(int depth) {
        if(depth >= 10) {
            return;
        }
        someMethod(depth + 1);
        System.out.println(depth);
    }
}
