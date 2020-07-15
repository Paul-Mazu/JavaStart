package objectMethods.zad1;

public class DataStore {

    private static final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computersQty = 0;

    public void add(Computer computer) {
        if (computersQty < MAX_COMPUTERS) {
            computers[computersQty] = computer;
            computersQty++;
        } else System.out.println("To many computers");
    }

    public void printInfo() {
        if (computersQty > 0) {
            for (int i =0; i < computersQty; i++) {
                System.out.println(computers[i]);
            }
        } else System.out.println("There is no computers");
    }

    public void checkAvailability(Computer computer) {
        int exemplars = 0;
        for (int i = 0; i < computersQty; i++) {
            if(computer.equals(computers[i]))
            exemplars++;
        }
        System.out.println(computer + ": Ilość dostępnych egzemplarzy: " + exemplars);
    }
}
