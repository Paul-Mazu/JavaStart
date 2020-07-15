package enumy.zad2;

public class OrdersSystem {
    private final static int MAX_ORDERS = 100;
    private Order[] orders = new Order[MAX_ORDERS];
    private int orderNumber = 0;

    public Order[] getOrders() {
        return orders;
    }

    public void printFilteredOrders(Status status) {
        for (int i = 0; i<orderNumber; i++) {
            if (orders[i].getStatus().equals(status)) {
                System.out.println(orders[i]);
            }
        }
    }

    public void addOrder(Order order) {
        orders[orderNumber] = order;
        orderNumber++;
    }

    public void printOrders() {
        for (int i = 0; i < orderNumber; i++) {
            System.out.println(orders[i]);
        }
    }

    public void addStatusToOrders(Order[] orders, Status status) {
        for (int i = 0; i < orderNumber; i++) {
            if (orders[i].getStatus()==null) orders[i].setStatus(status);
        }
    }
}
