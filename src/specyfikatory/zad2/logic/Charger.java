package specyfikatory.zad2.logic;

import specyfikatory.zad2.data.Phone;

public class Charger {

    public void charge(Phone phone) {
        for (int x=1; phone.getChargeLevel()<100; x++)
        phone.setChargeLevel(phone.getChargeLevel() + 1);
    }

}
