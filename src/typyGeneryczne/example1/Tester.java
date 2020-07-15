package typyGeneryczne.example1;

public class Tester {
    public static void main(String[] args) {

        Container<Integer> container = new Container<>();
        container.setArray(new Integer[]{10, 11, 15, 2});
        container.printArray();

        int sum = 0;
        for (Integer i : container.getArray()) {
            sum += i;
        }
        System.out.println("Suma: "  + sum);

    }
}
