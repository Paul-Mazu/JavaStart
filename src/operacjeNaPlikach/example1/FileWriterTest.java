package operacjeNaPlikach.example1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "textFile.txt";

        try (
                FileWriter fileWriter = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            bufferedWriter.write("Pawel");
            bufferedWriter.newLine();
            bufferedWriter.write("Izaela");
            bufferedWriter.newLine();
            bufferedWriter.write("Atur");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Nie udalo sie wprowadzic danych");
        }
    }
}
