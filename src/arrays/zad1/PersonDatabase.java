package arrays.zad1;

import java.util.Arrays;

public class PersonDatabase {

    private static final int MAX_PEOPLE = 1;
    private Person[] people;
    private int numberOfPeople = 0;

    public PersonDatabase() {
        this.people = new Person[MAX_PEOPLE];
    }

    public void addPerson(Person person) {

        if (person == null) throw new NullPointerException("Person can not be null");

        if (people.length > numberOfPeople) {
            people[numberOfPeople] = person;
            numberOfPeople++;
        } else {
            people = Arrays.copyOf(people, numberOfPeople * 2);
            people[numberOfPeople] = person;
            numberOfPeople++;
        }
    }

    public Person get(int index) {
        if (index >= numberOfPeople || index < 0) throw new IndexOutOfBoundsException("indx has to be positive and lover than: " + numberOfPeople);
        return people[index];
    }

    public int size() {
        return numberOfPeople;
    }

    public int arraySize() {
        return people.length;
    }

    public void remove(Person person) {
        if (person == null) throw new NullPointerException("Person can not be null");
        for (int i = 0; i < numberOfPeople; i++) {
            if (people[i].equals(person)) {
                people[i] = null;
                numberOfPeople--;
            }
        }

        Person[] temp = Arrays.copyOf(people, people.length);
        int counter = 0;
        people = new Person[people.length];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                people[counter] = temp[i];
                counter++;
            }
        }
    }

    public void printPeople() {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
