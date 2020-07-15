package operacjeNaPlikach.zad1;

import java.io.Serializable;

public class Company implements Serializable {

    private static final long serialVersionUID = 123456789123456789L;


    public static final int MAX_EMPLOYEES = 3;
    private Employee[] employees;
    private int employeesQty = 0;

    public Company() {
        this.employees = new Employee[MAX_EMPLOYEES];
    }

    public void addEmployee(Employee employee) {
        employees[employeesQty] = employee;
        employeesQty++;
    }

    public void printEmployees() {
        if (employeesQty > 0) {
            for (int i = 0; i < employeesQty; i++) {
                System.out.println(employees[i].toString());
            }
        } else System.out.println("Nie ma pracownikow");
    }

}
