package others.string.zad2;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wpisz wyraz: ");
        String string =scanner.nextLine();
        String newString;
        if (Character.isUpperCase(string.charAt(0)))newString = string.toUpperCase();
        else if (Character.isLowerCase(string.charAt(0))) newString = string.toLowerCase();
        else newString = string;

        System.out.println(newString);
    }


}
