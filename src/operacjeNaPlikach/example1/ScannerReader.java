package operacjeNaPlikach.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\poczt\\Desktop\\JavaStart\\Idea\\datatypes\\theTextFile.txt";
        File file = new File(fileName);

        boolean fileExists = file.exists();

        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udalo sie utworzyc pliku!");
            }
        }

        if (fileExists) {
            Scanner scanner = new Scanner(file);
            int lineCounter = 0;

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                lineCounter++;
            }

            scanner.close();

            System.out.println("Ilosc lini w pliku wynosi: " + lineCounter);

        }
    }
}
