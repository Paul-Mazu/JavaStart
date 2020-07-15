package exceptions.zad1Calculator;

public enum Equation {
    ADD("Dodaj"), SUBTRACT("Odejmij"), MULTIPLY("Pomnóż"), DIVIDE("Podziel");

    private String description;

    Equation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
