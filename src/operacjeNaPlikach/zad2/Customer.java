package operacjeNaPlikach.zad2;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
    private int id;
    private String first_name;
    private String last_name;
    private String country;
    private double value;

    public Customer(int id, String first_name, String last_name, String country, double value) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.country = country;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getCountry() {
        return country;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Double.compare(customer.value, value) == 0 &&
                Objects.equals(first_name, customer.first_name) &&
                Objects.equals(last_name, customer.last_name) &&
                Objects.equals(country, customer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, country, value);
    }

    @Override
    public String toString() {
        return id + " " + first_name + " " + last_name + " " + country + " " + value;
    }
}
