package interfaces.zad2;

public class Company {

    private final int MAX_EMPLOYEES = 20;
    private Employee[] employees = new Employee[MAX_EMPLOYEES];
    private int numberOfEmployees = 0;

    public void addEmployee(Employee employee) {
        employees[numberOfEmployees] = employee;
        numberOfEmployees++;
    }

    public void printEmployees() {
        for (int i = 0; i < numberOfEmployees; i++) {
            employees[i].employeePrinter();
        }
    }

    public double monthlyLaborCost() {
        double cost = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            cost += employees[i].monthlySalaryCounter();
        }
        return cost;
    }

    public double annualyLaborCost() {
        double cost = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            cost += employees[i].annualSalary();
        }
        return cost;
    }

}
