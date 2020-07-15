package Rekurencja.example3;

public class NumberAdder {
    public static void main(String[] args) {

        System.out.println(sum(10));
    }

    static int sum (int number) {
        return number > 1 ? number + sum(number-1) : number;
    }
}
