package Rekurencja.example1;

public class NumberAdder {
    public static void main(String[] args) {

        System.out.println(sum(10));

    }

    private static int sum(int number) {
        if (number > 1) {
            return number + sum(number-1);
        } else return number;
    }
}
