package exceptions.example3;

public class School {
    private Student students[];
    private int maxStudents;

    public School(int maxStudents) {
        students = new Student[maxStudents];
    }

    public void addStuden(Student s) {
        students[maxStudents] = s;
        maxStudents++;
    }

    public Student findStudent(String name, String surname) throws NoElementFoundException {
        for (int i = 0; i < maxStudents; i++) {
            if (students[i].getName().equals(name) && students[i].getSurname().equals(surname)) return students[i];
        }
        throw new NoElementFoundException();
    }
}
