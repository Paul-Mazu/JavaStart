package arrays.zad1;

public class DatabaseTester {
    public static void main(String[] args) {

        PersonDatabase database = new PersonDatabase();
        Person person1 = new Person("Tomek", "Wierzba", "123456789");
        Person person2 = new Person("Janek", "Jakis", "987654321");
        Person person3 = new Person("Malgosia", "Inna", "123789456");
        Person person4 = new Person("Ania", "Cos", "789123456");
        Person person5 = new Person("Monika", "Jakastam", "789123456");

        database.addPerson(person1);
        database.addPerson(person2);
        database.addPerson(person3);
        database.addPerson(person4);

        database.printPeople();
        database.remove(person2);
        database.printPeople();
    }
}
