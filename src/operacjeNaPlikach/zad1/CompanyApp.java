package operacjeNaPlikach.zad1;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    Scanner scanner = new Scanner(System.in);
    private final String fileName = "employees.obj";
    Company company = new Company();

    public static void main(String[] args) {

        CompanyApp companyApp = new CompanyApp();
        companyApp.optionsPicker();
    }

    public void optionsPicker() {
        boolean exit = false;
        while (!exit) {
            printOptions();
            int choice = getNumber();
            switch (choice) {
                case 0:
                    exit = true;
                    System.out.println("Wychodze...");
                    break;
                case 1:
                    company.addEmployee(inputEmployee());
                    break;
                case 2:
                    downloadEmployees();
                    break;
                case 3:
                    company.printEmployees();
                    break;
                case 4:
                    saveEmployees(company);
                    break;
            }
        }
    }

    private int getNumber() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private void printOptions() {
        System.out.println("Wybierz opcje: ");
        System.out.println("0 - Wyjdź");
        System.out.println("1 - Wprowadź dane");
        System.out.println("2 - Pobierz z pliku");
        System.out.println("3 - Pokaż pracownikow");
        System.out.println("4 - Zapisz do pliku");
    }

    private Employee inputEmployee() {
        System.out.println("Podaj imie:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();
        System.out.println("Podaj pensje:");
        int salary = getNumber();
        return new Employee(name, surname, salary);
    }

    private void downloadEmployees() {
        try (
                FileInputStream fileInputStream = new FileInputStream(fileName);
                ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)
        ) {
            company = (Company) inputStream.readObject();
            System.out.println("Pobrano pracownikow");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nie odnaleziono pliku");
        }
    }

    private void saveEmployees(Company company) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            outputStream.writeObject(company);
            System.out.println("Zapisano do pliku");
        } catch (IOException e) {
            System.out.println("Nie udalo sie zapisac pliku");
        }
    }
}
