package operacjeNaPlikach.zad2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Logic {
    private String filename = "clients.csv";
    File file = new File(filename);

    private int numberOfCustomers() {
        int numberOfCustomers = 0;
        try (
                Scanner scanner = new Scanner(file);
        ) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                numberOfCustomers++;
            }
        } catch (IOException e) {
            System.out.println("Nie odnaleziono pliku");
        }
        System.out.println(numberOfCustomers);
        return numberOfCustomers;
    }

    public Customer[] downloadClients() {
        Customer[] customers = new Customer[numberOfCustomers()];
        try (
                Scanner scanner = new Scanner(file);
        ) {
            scanner.nextLine();
            for (int i = 0; i < customers.length; i++) {
                String csvLine = scanner.nextLine();
                customers[i] = createClientFromCsvLine(csvLine);
            }
            System.out.println("Pobrano klientow");
        } catch (IOException e) {
            System.out.println("Nie odnaleziono pliku");
        }
        return customers;
    }

    private static Customer createClientFromCsvLine(String csvLine) {
        String[] data = csvLine.split(",");
        int id = Integer.parseInt(data[0]);
        String firstName = data[1];
        String name = data[2];
        String country = data[3];
        double value = Double.parseDouble(data[4]);
        return new Customer(id, firstName, name, country, value);
    }

    public void printCustomers(Customer[] customers) {
        for (Customer customer : customers) {
            customer.toString();
        }
    }

    public void theMostValueCustomer(Customer[] customers) {

        Customer customer = customers[0];
        for (Customer cust : customers) {
            if (cust.getValue() > customer.getValue()) customer = cust;
        }
        System.out.println("Najbardziej wartosciowy klient to: " + customer.toString());
    }

    public void customersFromCountry(Customer[] customers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj panstwo: ");
        String chosenCountry = scanner.nextLine();
        int numberOfCustomersFromChosenCountry = 0;
        int nextNumber = 0;
        for (Customer customer:customers) {
            if (customer.getCountry().equals(chosenCountry)) numberOfCustomersFromChosenCountry++;
        }
        Customer[] customersOfTheCountry = new Customer[numberOfCustomersFromChosenCountry];

        for (Customer customer:customers) {
            if (customer.getCountry().equals(chosenCountry)) {
                customersOfTheCountry[nextNumber] = customer;
                nextNumber++;
            }
        }

        for (Customer customer:customersOfTheCountry) {
            System.out.println(customer.toString());
        }
        System.out.println("Srednia wartosc zakupow z tego panstwa wynosi: " + averageValue(customersOfTheCountry));
    }

    private double averageValue(Customer[] customers) {
        double value = 0;
        for (Customer cu :customers) {
            value += cu.getValue();
        }
        return value/customers.length;
    }
}


