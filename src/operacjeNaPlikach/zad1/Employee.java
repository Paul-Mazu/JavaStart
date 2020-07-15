package operacjeNaPlikach.zad1;

public class Employee extends Person {

    private int salary;

    public Employee(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return Employee.super.toString() + " " + salary;
    }


}
