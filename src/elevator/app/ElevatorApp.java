package elevator.app;

import elevator.data.Elevator;
import elevator.data.Person;

public class ElevatorApp {

    public static void main(String[] args) {

        Person person1 = new Person("Pawel", 84);
        Person person2 = new Person("Michal", 80);
        Person person3 = new Person("Adam", 70);
        Person person4 = new Person("Jan", 70);
        Person person5 = new Person("Monika", 70);

        Elevator elevator = new Elevator();
        elevator.addPerson(person1);
        elevator.addPerson(person2);
        elevator.addPerson(person3);
        elevator.addPerson(person4);
        elevator.addPerson(person5);
        System.out.println(elevator.getPeopleQty());

    }
}
