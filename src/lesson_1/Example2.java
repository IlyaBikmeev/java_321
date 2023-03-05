package lesson_1;

public class Example2 {
    public static void main(String[] args) {
        //printNumberBackwards(765432);
        printDigitsSeparately(765432);
    }

    //Дано целое число больше нуля, вывести его цифры в обратном порядке
    public static void printNumberBackwards(int number) {
        if(number == 0) {
            return;
        }
        System.out.print(number % 10);    //печатаем последнюю цифру
        printNumberBackwards(number / 10);
    }


    //Дано число, вывести его цифры по порядку, каждая на новой строке.
    //Пример:
    /*
        Input: 764531
        Output:
        7
        6
        4
        5
        3
        1
     */
    public static void printDigitsSeparately(int number) {
        if(number == 0) {
            return;
        }
        printDigitsSeparately(number / 10);
        System.out.println(number % 10);
    }
}
