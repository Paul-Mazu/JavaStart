package objectMethods.zad1;

import java.util.Objects;

public class Computer {

    private String producent;
    private int model;

    public Computer(String producent, int model) {
        this.producent = producent;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return model == computer.model &&
                Objects.equals(producent, computer.producent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producent, model);
    }

    @Override
    public String toString() {
        return producent + " " + model;
    }
}
