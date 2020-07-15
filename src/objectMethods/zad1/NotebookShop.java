package objectMethods.zad1;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore store = new DataStore();

        Computer computer1 = new Computer("Lenovo", 200);
        Computer computer2 = new Computer("Samsung", 300);
        Computer computer3 = new Computer("Apple", 400);
        Computer computer4 = new Computer("HP", 500);
        Computer computer5 = new Computer("Samsung", 300);
        Computer computer6 = new Computer("Samsung", 300);
        Computer computer7 = new Computer("Acer", 300);

        store.add(computer1);
        store.add(computer2);
        store.add(computer3);
        store.add(computer4);
        store.add(computer5);
        store.add(computer6);

        store.checkAvailability(computer7);

        store.printInfo();
    }
}
