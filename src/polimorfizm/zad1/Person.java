package polimorfizm.zad1;

public class Person {

    private String name;
    private String surname;
    private int salary;

    public Person(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public String printPerson() {
        return null;
    }
}
