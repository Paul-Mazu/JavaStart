package typyOpakowujace.zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\poczt\\Desktop\\JavaStart\\Idea\\datatypes\\numbers.txt";
        File file = new File(fileName);

        String[] numbers = new String[0];
        try {
            numbers = getNumbers(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int result = Integer.valueOf(numbers[0]) + Integer.valueOf(numbers[1]) + Integer.valueOf(numbers[2]) ;
        System.out.println("Suma pierwszych 3 liczb to: " + result);

        BigInteger bigNumber = new BigInteger(numbers[3]);
        BigInteger bigNumber1 = new BigInteger(numbers[4]);
        BigInteger bigResult = bigNumber.add(bigNumber1);
        System.out.println("Suma dwóch dużych liczb to: " + bigResult);


    }

    private static int lineCounter(File file) throws FileNotFoundException {
        int numberOfLines = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            numberOfLines++;
        }
        scanner.close();
        return numberOfLines;
    }

    public static String[] getNumbers(File file) throws FileNotFoundException {
        int line = 0;
        Scanner scanner = new Scanner(file);
        String[] numbers = new String[lineCounter(file)];
        while (scanner.hasNextLine()) {
            numbers[line] = scanner.nextLine();
            line++;
        }
        scanner.close();
        return numbers;
    }
}

