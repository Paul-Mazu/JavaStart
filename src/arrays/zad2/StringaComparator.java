package arrays.zad2;

import java.util.Arrays;
import java.util.Scanner;

public class StringaComparator {
    public static void main(String[] args) {

    result();

    }
    static Scanner scanner = new Scanner(System.in);

    private static String getString() {
        return scanner.nextLine();
    }

    private
    static boolean ifEqual() {
        System.out.println("Podaj pierwszy wyraz");
        String string1 = getString().toUpperCase();
        System.out.println("Podaj drugi wyraz");
        String string2 = getString().toUpperCase();

        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (chars1.length == chars2.length) {
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i]) return false;
            }
        } else return false;
        return true;
    }

    public static void result () {
        if (ifEqual()) System.out.println("The worlds are equals");
        else System.out.println("The worlds are not equals");
    }
}
