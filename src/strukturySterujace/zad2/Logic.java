package strukturySterujace.zad2;

public class Logic {

    void compareTo5000(int x) {
        if (x < 5_000) System.out.println("X jest mniejszy od 5 tys: " + x);
        else if (x == 5_000) System.out.println("X jest rowny 5 tys: " + x);
        else System.out.println("X jest wiekszy od 5 tys: " +x);
    }

    void ifEven(int x ) {
        if (x % 2 == 0) System.out.println("X jest parzyste");
        else System.out.println("X jest nieparzyste");
    }

    int metoda(int x) {
        if (x > 999|| x == 0) return x;
        else if (x / 10 > 10 && x / 10 < 99) return x*10;
        else return x * 100;
    }
}
