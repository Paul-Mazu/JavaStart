package algorytmika.zad1;

public class TempClass {
    public static void main(String[] args) {

        int[] numbers = {4, 5, 6, 7, 8, 9, 13, 12, 6, 7};
        int result = 0;

        for (int value: numbers) {
            if (value % 2 == 0) {
                result += value;
            }
        }

        System.out.println(result);


    }
}
