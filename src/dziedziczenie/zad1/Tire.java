package dziedziczenie.zad1;

public class Tire extends Part {
    private int size;
    private int width;

    public Tire(int idNumber, String producent, String model, int serieNumber, int size, int width) {
        super(idNumber, producent, model, serieNumber);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }
}
