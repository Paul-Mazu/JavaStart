package arrays.zad1;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String PESEl;

    public Person(String name, String surname, String PESEl) {
        this.name = name;
        this.surname = surname;
        this.PESEl = PESEl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPESEl() {
        return PESEl;
    }

    public void setPESEl(String PESEl) {
        this.PESEl = PESEl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(PESEl, person.PESEl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, PESEl);
    }

    @Override
    public String toString() {
        return "name: " + name + ", surname: " + surname +", PESEl: " + PESEl;
    }
}
