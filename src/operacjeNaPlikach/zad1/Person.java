package operacjeNaPlikach.zad1;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 123456789L;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person() {}

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
