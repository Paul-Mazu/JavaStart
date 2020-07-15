package interfaces.zad2;

public class HourlyRateEmployee implements Employee {

    private String name;
    private String surname;
    private double hourlyRate;
    private double hours;

    public HourlyRateEmployee(String name, String surname, double hourlyRate, double hours) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }



    @Override
    public double monthlySalaryCounter() {
        return hourlyRate * hours;
    }

    @Override
    public double annualSalary() {
        return monthlySalaryCounter() * 12;
    }

    @Override
    public void employeePrinter() {
        System.out.println("Pracownik godzinowy: " + name + " " + surname + ", wynagrodzenie miesieczne: " + monthlySalaryCounter() + ", wynagrodzenie roczne: " + annualSalary());
    }
}
