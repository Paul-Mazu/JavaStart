package operacjeNaPlikach.example2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = null;

        try (
                FileInputStream fileInputStream = new FileInputStream(fileName);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            p1 = (Person) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nie udalo sie odczytac pliku");
        }

        if (p1 != null) {
            System.out.println("Wczytano dane o: ");
            System.out.println(p1.toString());
        }
    }
}
