package staticMethods.zad1;

public class University {
    public static void main(String[] args) {

        Student student1 = new Student("Michal", "Jakis", 123456);
        Student student2 = new Student("Daniel", "Tabi", 1456789);
        Student student3 = new Student("Daniel", "Tabi", 1456789);
        Student student4 = new Student("Daniel", "Tabi", 1456789);
        Student student5 = new Student("Daniel", "Tabi", 1456789);

        System.out.println(Student.getNumberStudents());
    }
}
