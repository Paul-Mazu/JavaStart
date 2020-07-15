package others;

public class Variables {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean greter = x > y;
        System.out.println(greter);

        boolean doubleXIsGreater = x * 2 > 5;
        System.out.println(doubleXIsGreater);

        boolean task3 = y<x+3 && y>x-2;
        System.out.println(task3);

        boolean task4 = (x*y)%2==0;
        System.out.println(task4);

        int netto = 1000;
        double vat = netto * 0.23;
        double brutto = netto + vat;

        System.out.println(brutto);


    }
}
