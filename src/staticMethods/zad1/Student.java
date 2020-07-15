package staticMethods.zad1;

public class Student {
    private String name;
    private String surname;
    private int indeksNumber;
    private static int numberStudents = 0;

    public Student(String name, String surname, int indeksNumber) {
        this.name = name;
        this.surname = surname;
        this.indeksNumber = indeksNumber;
        numberStudents++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIndeksNumber() {
        return indeksNumber;
    }

    public static int getNumberStudents() {
        return numberStudents;
    }
}
