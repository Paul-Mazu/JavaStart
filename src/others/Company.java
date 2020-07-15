package others;

import java.time.LocalDate;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Marek";
        employee1.surname = "Kowalski";
        employee1.birthday = LocalDate.of(1989,5,1);
        employee1.emplymentDay = LocalDate.of(2020,3,1);

        Employee employee2 = new Employee();
        employee2.name = "Jan";
        employee2.surname = "Kowalik";
        employee2.birthday = LocalDate.of(1989,4,23);
        employee2.emplymentDay = LocalDate.of(2019,12,1);

        Employee employee3 = new Employee();
        employee3.name = "Bartosz";
        employee3.surname = "Bernacki";
        employee3.birthday = LocalDate.of(1987,5,5);
        employee3.emplymentDay = LocalDate.of(2019,8,1);

    }
}
