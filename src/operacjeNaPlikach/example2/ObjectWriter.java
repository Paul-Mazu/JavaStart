package operacjeNaPlikach.example2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = new Person("Jan", "Kowalski");

        try (
        FileOutputStream outputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        ) {
            objectOutputStream.writeObject(p1);
            System.out.println("Zapisano objekt do pliku");
        } catch (IOException e) {
            System.out.println("Nie udalo sie zapisac pliku");
        }
    }
}
