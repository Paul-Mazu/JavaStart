package typyOpakowujace.zad2;

public class Statistics {
    private int numberOfDigits;
    private int numberOfLetters;
    private int theBiggestNumber;
    private String thereIsNoDigits;

    public Statistics(int numberOfDigits, int numberOfLetters, int theBiggestNumber) {
        this.numberOfDigits = numberOfDigits;
        this.numberOfLetters = numberOfLetters;
        this.theBiggestNumber = theBiggestNumber;
    }

    public Statistics(int numberOfLetters) {
        this.numberOfLetters = numberOfLetters;
        this.thereIsNoDigits = "Nie znaleziono cyfr";
    }

    @Override
    public String toString() {
        if (numberOfDigits < 1) return "Ilośc liter: " + numberOfLetters + "\n" + thereIsNoDigits;
        else return "Ilość liter: " + numberOfLetters + "\n" + "Ilość cyfr: " + numberOfDigits + "\nNajwiększa cyfra: " + theBiggestNumber;
    }
}
