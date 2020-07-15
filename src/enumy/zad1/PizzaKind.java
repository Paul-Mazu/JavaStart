package enumy.zad1;

import java.util.Arrays;

public enum PizzaKind {
    MARGHERITA("Margherita", new String[]{"Sos pomidorowy", "Ser"}), CAPRICIOSA("Capriciosa", new String[]{"Sos pomidorowy", "Ser", "Pieczarki"}), PROSCIUTTO("Prosciutto", new String[]{"Sos pomidorowy", "Ser", "Szynka"});

    private String name;
    private String[] ingrediens;

    PizzaKind(String name, String[] ingrediens) {
        this.name = name;
        this.ingrediens = ingrediens;
    }

    public static PizzaKind chosenPizza(String chosen) {
        for (PizzaKind pizzaKind : PizzaKind.values()) {
            if (pizzaKind.name.equals(chosen)) return pizzaKind;
        }
        return null;
    }

    public String[] getIngrediens() {
        return ingrediens;
    }

    @Override
    public String toString() {
        return "Pizza " + name + " składniki: " + Arrays.toString(ingrediens);
    }

    public static void printKinds() {
        for (PizzaKind pizzaKind : PizzaKind.values()) {
            System.out.print(pizzaKind.ordinal() + 1 + ". " + pizzaKind.name + ": ");
            for (String ingredient: pizzaKind.getIngrediens()) {
                System.out.print(ingredient + " ");
            }
            System.out.println();
        }
    }

}
