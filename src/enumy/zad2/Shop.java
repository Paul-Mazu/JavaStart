package enumy.zad2;

public class Shop {
    public static void main(String[] args) {

        DataIn dataIn = new DataIn();
        OrdersSystem ordersSystem = new OrdersSystem();

        Order order = new Order("Laptop", 3999);
        Order order1 = new Order("Phone", 2499);
        Order order2 = new Order("Monitor", 1299);
        Order order3 = new Order("Monitor", 1299, Status.SHIPPED);
        Order order4 = new Order("Monitor", 1299, Status.SHIPPED);
        Order order5 = new Order("Monitor", 1299, Status.CANCELLED);

        ordersSystem.addOrder(order);
        ordersSystem.addOrder(order1);
        ordersSystem.addOrder(order2);
        ordersSystem.addOrder(order3);
        ordersSystem.addOrder(order4);
        ordersSystem.addOrder(order5);

        ordersSystem.printOrders();

        Status status = dataIn.getStatus();
        ordersSystem.addStatusToOrders(ordersSystem.getOrders(), status);
        ordersSystem.printOrders();

        Status statusForFilter = dataIn.getStatus();
        ordersSystem.printFilteredOrders(statusForFilter);
    }
}
