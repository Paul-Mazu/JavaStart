package specyfikatory.zad2.app;

import specyfikatory.zad2.data.Phone;
import specyfikatory.zad2.logic.Charger;

public class PhoneApp {
    public static void main(String[] args) {

        Phone phone = new Phone("Samsung", "s10", 3400, 75);
        phone.printInfo();
        Charger charger = new Charger();
        charger.charge(phone);
        phone.printInfo();


    }
}
