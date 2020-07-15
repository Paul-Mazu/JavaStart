package enumy.zad1;

import java.util.Objects;

public class Pizza {
    private PizzaKind kind;

    public Pizza(PizzaKind kind) {
        this.kind = kind;
    }

    public PizzaKind getKind() {
        return kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return kind == pizza.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind);
    }

    @Override
    public String toString() {
        return kind.toString();
    }
}
