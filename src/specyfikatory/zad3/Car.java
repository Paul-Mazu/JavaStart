package specyfikatory.zad3;

public class Car {
    private int fuelLevel;
    private boolean engineFunktional;
    private boolean fuelGateClose;
    private boolean bootClosed;
    private boolean engineOn;
    private final static int ENGINE_ON = 100;
    private final static int BROKEN_ENGINE = 200;
    private final static int NO_FUEL = 300;
    private final static int FUEL_GATE_OPEN = 400;
    private final static int BOOT_OPEN = 500;

    public Car(int fuelLevel, boolean engineFunktional, boolean fuelGateClose, boolean bootClosed, boolean engineOn) {
        this.fuelLevel = fuelLevel;
        this.engineFunktional = engineFunktional;
        this.fuelGateClose = fuelGateClose;
        this.bootClosed = bootClosed;
        this.engineOn = engineOn;
    }

    public void start() {
        if (fuelLevel > 0 && engineFunktional == true && fuelGateClose == true && bootClosed == true && engineOn == false) {
            engineOn = true;
            System.out.println("Odpalono silnik ");
        } else if (engineOn == true) System.out.println("Silnik już odpalony " + ENGINE_ON);
        if (engineFunktional == false) System.out.println("Silnik uszkodzony " + BROKEN_ENGINE);
        if (fuelLevel ==0) System.out.println("Brak paliwa " + NO_FUEL);
        if (fuelGateClose == false) System.out.println("Wlew paliwa otwarty " + FUEL_GATE_OPEN);
        if (bootClosed == false) System.out.println("Bagażnik otwarty " + BOOT_OPEN);

    }

//    public void start() {
//        if (fuelLevel == 0) {
//            System.out.println("Brak Paliwa " + NO_FUEL);
//        } else {
//            int option = 0;
//            switch (option) {
//                case BROKEN_ENGINE:
//                    System.out.println("Silnik zepsuty " + BROKEN_ENGINE);
//                case FUEL_GATE_OPEN:
//                    System.out.println("Wlew paliwa otwarty " + FUEL_GATE_OPEN);
//                case BOOT_OPEN:
//                    System.out.println("Bagażnik otwarty " + BOOT_OPEN);
//                default:
//                    engineOn = true;
//                    System.out.println("Silnik odpalony " + ENGINE_ON);
//            }
//        }
//    }
}
