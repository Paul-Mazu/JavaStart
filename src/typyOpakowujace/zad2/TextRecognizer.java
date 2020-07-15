package typyOpakowujace.zad2;

import java.util.Scanner;

public class TextRecognizer {
    public static void main(String[] args) {

        Statistics statistics = getTheStatistics();
        System.out.println(statistics.toString());

    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst: ");
        return scanner.nextLine();
    }

    public static Statistics getTheStatistics() {
        String text = getString();
        char[] chars = text.toCharArray();
        int numberOfDigits = 0;
        int numberOfLetters = 0;
        int theBiggestNumber = 0;

            for (char ch : chars) {
                if (Character.isDigit(ch)) {
                    numberOfDigits++;
                    if (Character.getNumericValue(ch) > theBiggestNumber)
                        theBiggestNumber = Character.getNumericValue(ch);
                } else if (Character.isLetter(ch)) numberOfLetters++;
            }

            if (numberOfDigits < 1) {
                return new Statistics(numberOfLetters);
            } else return new Statistics(numberOfDigits, numberOfLetters, theBiggestNumber);
        }
}
