package enumy.zad2;

public enum Status {

    NEW("Złożono zamówienie, ale jeszcze nie opłacono"),
    PAID("Zamówienie opłacone"),
    SHIPPED("Zamówienie wysłane"),
    DELIVERED("Zamównienei dostarczone"),
    CANCELLED("Zamówienie anulowano");

    private String description;

    Status(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Status: "+ description;
    }



}
