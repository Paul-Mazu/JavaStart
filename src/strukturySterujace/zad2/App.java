package strukturySterujace.zad2;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        Logic logic = new Logic();
        Random random = new Random();
        int x = random.nextInt(10000);

        logic.compareTo5000(x);
        logic.ifEven(x);
        x = logic.metoda(x);
        System.out.println(x);

    }
}
