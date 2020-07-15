package typyGeneryczne.zad1;

public class TestClass {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Pawelek", 31);
        pair1.print();
        Pair<String, String> pair2 = new Pair<>("Iza", "Pawel");
        pair2.print();

    }
}
