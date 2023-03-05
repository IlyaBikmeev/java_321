package lesson_1;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] first = {1, 2, 6};
        int[] second = {7, 8, 13, 18, 20};
        int[] result = mergeSortedArrays(first, second);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int last = 0;       //Последняя позиция в массиве result, куда можно вставить элемент


        while(i != arr1.length || j != arr2.length) {
            if(j == arr2.length || (i != arr1.length && arr1[i] < arr2[j])) {
                result[last] = arr1[i];
                i++;
            }
            else {
                result[last] = arr2[j];
                j++;
            }
            last++;
        }

        return result;
    }
}
