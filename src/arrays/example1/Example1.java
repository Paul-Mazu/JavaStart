package arrays.example1;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        String[] names = {"Basia", "Kasia", "Wojtek", "Tomek"};
        Integer[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));
        sorting(numbers);
        System.out.println(Arrays.toString(numbers));


    }

    public static Integer[] sorting(Integer[] array) {
        for (int j = 1; j < array.length; j++) {
            for (int i = 0; i < array.length - j; i++) {
                int temp = 0;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
//    public static  <T> void printArrays( T[] arr) {
//        for (T t : arr) {
//            System.out.print(t + ", ");
//        }
//        System.out.println();
//    }
}
