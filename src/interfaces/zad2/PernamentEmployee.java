package interfaces.zad2;

import java.util.Objects;

public class PernamentEmployee implements Employee{

    private String name;
    private String surname;
    private double salary;

    public PernamentEmployee(String name, String surname, double salary) {
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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PernamentEmployee that = (PernamentEmployee) o;
        return Double.compare(that.salary, salary) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary);
    }

    @Override
    public double monthlySalaryCounter() {
        return salary;
    }

    @Override
    public double annualSalary() {
        return 12 * salary * 1.05;
    }

    @Override
    public void employeePrinter() {
        System.out.println("Pracownik pelnoetatowy: " + name + " " + surname + ", wynagrodzenie miesieczne: " + monthlySalaryCounter() + ", wynagrodzenie roczne: " + annualSalary());
    }
}
