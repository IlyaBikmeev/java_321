package lesson_1;

//Сгенерировать всевозможные комбинации строк (пароли),
// состоящие только из строчных латинских букв длины n (задаётся пользователем)
// Напечатать на экран
public class BruteForce {
    public static void main(String[] args) {
        bruteForce("", 4);

    }

    public static void bruteForce(String curString, int length) {
        if(curString.length() == length) {
            System.out.println(curString);
            return;
        }

        for(char c = 'a'; c <= 'z'; c++) {
            bruteForce(curString + c, length);
        }
    }
}
