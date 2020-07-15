package enumy.zad2;

import java.util.Scanner;

public class DataIn {

    Scanner scanner = new Scanner(System.in);

    public Status getStatus() {
        String status;
        do {
            System.out.println("Wprowadź status zamówienia: ");
            status = scanner.nextLine();
        } while (!statusCorrect(status));

        return returnStatus(status);
    }

    private Status returnStatus(String dataIn) {
        for (Status status: Status.values()) {
            if (status.name().equals(dataIn)) return status;
        }
        return null;
    }

    private boolean statusCorrect(String dataIn) {
        for (Status status: Status.values()) {
            if (status.name().equals(dataIn)) return true;
        }
        return false;
    }
}
