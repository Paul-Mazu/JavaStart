package operacjeNaPlikach.zad2;

public class App {
    public static void main(String[] args) {
        Logic logic = new Logic();
        Customer[] customers = logic.downloadClients();
        logic.theMostValueCustomer(customers);
        logic.customersFromCountry(customers);
        System.out.println(customers[customers.length].toString());

    }
}
