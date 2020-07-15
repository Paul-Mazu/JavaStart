package dziedziczenie.zad1;

public class Part {
    private int idNumber;
    private String producent;
    private String model;
    private int serieNumber;

    public Part(int idNumber, String producent, String model, int serieNumber) {
        this.idNumber = idNumber;
        this.producent = producent;
        this.model = model;
        this.serieNumber = serieNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public int getSerieNumber() {
        return serieNumber;
    }
}
