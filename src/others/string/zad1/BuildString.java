package others.string.zad1;

import java.util.Scanner;

public class BuildString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] stringsArray = new String[scanner.nextInt()];
        System.out.println("Z ile wyrazów będzie się składała tablica?");
        int howManyWorlds = scanner.nextInt();
        scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        StringBuilder theWord = new StringBuilder();
        for (int i = 0; i < howManyWorlds; i++) {
            System.out.println("Wprowadź wyraz " + (i + 1) + ": " );
            String temporarString = scanner.nextLine();
            builder.append(temporarString);
            builder.append(" ");
            char a = temporarString.charAt(temporarString.length()-1);
            theWord.append(a);
        }
        System.out.println(builder.toString());
        System.out.println(theWord.toString());
    }
}
