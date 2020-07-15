package exceptions.example3;

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School(3);
        Student student1 = new Student(1, "Jan", "Kowalski");
        Student student2 = new Student(2, "Michał", "Zawadzki");

        school.addStuden(student1);
        school.addStuden(student2);

        try {
            Student student = school.findStudent("Jan", "Kowalski");
            System.out.println("Numer id studenta: " + student.toString() + " to: " + student.getStudentId());
            Student studentt = school.findStudent("Jan", "Kowalewski");
            System.out.println("Numer id studenta: " + studentt.toString() + " to: " + studentt.getStudentId());

        } catch (NoElementFoundException e) {
            System.err.println("Nie odnaleziono takiego studenta");
        }
    }
}
