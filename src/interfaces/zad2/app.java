package interfaces.zad2;

public class app {
    public static void main(String[] args) {
        Company company = new Company();

        company.addEmployee(new PernamentEmployee("Pawel", "Mazurek", 10000));
        company.addEmployee(new HourlyRateEmployee("Michal", "Wnek", 40, 100));

        company.printEmployees();
        System.out.println("Suma miesiecznych wynagrodzen: " + company.monthlyLaborCost());
        System.out.println("Suma rocznych wynagrodzen: " + company.annualyLaborCost());
    }
}
