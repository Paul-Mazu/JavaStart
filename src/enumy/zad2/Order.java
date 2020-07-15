package enumy.zad2;

public class Order {

    private String name;
    private double price;
    private Status status;

    public Order(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Order(String name, double price, Status status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (status == null) return "Zamówiłeś: " + name + " " + price;
        else return "Zamówiłeś: " + name + ", " + price + ", " +  status.toString();
    }

}
