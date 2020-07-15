package others.metodyIKonstruktory.zad4;

public class Home {
    public static void main(String[] args) {
        Home home = new Home(1000, 100);
        home.takeShower();
        home.takeBath();
        home.makeDinner();
        System.out.println(home.getWater());
        System.out.println(home.getFuel());
    }

    private int water;
    private int fuel;

    public Home(int water, int fuel) {
        this.water = water;
        this.fuel = fuel;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void takeShower() {
        water -= 48;
    }

    public void takeBath() {
        water -= 86;
    }

    public void makeDinner() {
        water -= 4;
        fuel -= 1;
    }

}
