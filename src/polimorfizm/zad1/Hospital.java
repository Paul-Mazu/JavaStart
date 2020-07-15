package polimorfizm.zad1;

public class Hospital {

    private final int max_staff = 100;
    Person[] staff = new Person[max_staff];
    private int staff_counter = 0;

    public void addPerson(Person person) {
        staff[staff_counter] = person;
        staff_counter++;
    }

    public void printStaff() {
        for (int i =0; i < staff_counter; i++){
            System.out.println(staff[i].printPerson());
        }
    }

}
