package operacjeNaPlikach.example1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTester {
    public static void main(String[] args) {

        String fileName = "textFile.txt";

        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            int lines = 0;

            while ((nextLine = bufferedReader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilosc wierszy wynosi: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
