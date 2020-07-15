package polimorfizm.zad1;

public class Nurse extends Person {

    private int overhours;

    public Nurse(String name, String surname, int salary, int overhours) {
        super(name, surname, salary);
        this.overhours = overhours;
    }

    public int getOverhours() {
        return overhours;
    }
@Override
    public String printPerson() {
        return "Nurse, Name: " + getName() + ", Surname: " + getSurname() + ", Salary: " + getSalary() + ", Overhours: " + getOverhours();
    }
}
