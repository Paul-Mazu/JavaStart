package polimorfizm.zad1;

public class Doctor extends Person {

    private int bonus;

    public Doctor(String name, String surname, int salary, int bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
@Override
    public String printPerson() {
        return "Doctor, Name: " + getName() + ", Surname: " + getSurname() + ", Salary: " + getSalary() + ", Bonus: " + getBonus();
    }
}
