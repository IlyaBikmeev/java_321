package lesson_1;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 1, 10, 5, 8, 15, 6};
        sort(arr, 0, arr.length - 1);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sort(int[] arr, int start, int end) {
        //Если данный подмассив пустой, либо длины 1, то ничего не делаем.
        if(end - start <= 0) {
            return;
        }

        System.out.println("start: " + start + " end: " + end);
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        //Выбираем опорный элемент. Переупорядочиваем массив.
        //Теперь у нас есть позиция опорного элемента и массив упорядочен относительно его.
        int pivotPosition = partition(arr, start, end);

        //Сортируем левую половину
        sort(arr, start, pivotPosition - 1);

        //Сортируем правую половину
        sort(arr, pivotPosition + 1, end);

        //Вуаля! Все элементы слева <= pivot, справа > pivot. При этом вся левая часть отсортирована
        //Правая тоже.
        //Массив отсортирован.
    }

    //рассматривается часть массива от start до end. Из этой части выбирается опорный элемент
    //и выполняется переупорядочивание. (слева от опорного элемента стоят элементы <=, справа - >.
    //Вернуть индекс опорного элемента после упорядочивания
    public static int partition(int[] arr, int start, int end) {
        //Выберем рандомный опорный элемент.
        int randomIndex = new Random().nextInt(end - start + 1) + start;
        //Поместим его в конец
        int tmp = arr[randomIndex];
        arr[randomIndex] = arr[end];
        arr[end] = tmp;

        int lastPos = start;
        int pivot = arr[end];       //Опорный элемент

        //Слева от lastPos стоят элементы, строго меньшие pivot.

        //Последнюю позицию не включаю, потому что на ней стоит опорный элемент.
        for(int i = start; i < end; ++i) {
            if(arr[i] < pivot) {
                //Меняем местами элементы с номерами i и lastPost
                int buf = arr[i];
                arr[i] = arr[lastPos];
                arr[lastPos] = buf;

                lastPos++;
            }
        }

        //Теперь у нас все элементы слева от lastPos строго меньше, чем pivot.
        //Сам же элемент, стоящий в позиции lastPos больше либо равен pivot.
        //Меняем местами опорный элемент с элементом в позиции lastPos, получаем то что хотели.

        int buf = arr[end];
        arr[end] = arr[lastPos];
        arr[lastPos] = buf;
        return lastPos;
    }
}
