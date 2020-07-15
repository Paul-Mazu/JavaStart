package Rekurencja.zad1;

public class FactorialCounter {

    public static void main(String[] args) {
        System.out.println(factorialChecker(10));
    }

    static int factorialChecker(int number) {
        return number > 1? number * factorialChecker(number -1) : number;
    }

}
