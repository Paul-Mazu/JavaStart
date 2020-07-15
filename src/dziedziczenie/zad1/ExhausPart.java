package dziedziczenie.zad1;

public class ExhausPart extends Part {
    private boolean euStandard;

    public ExhausPart(int idNumber, String producent, String model, int serieNumber, boolean euStandard) {
        super(idNumber, producent, model, serieNumber);
        this.euStandard = euStandard;
    }

    public boolean isEuStandard() {
        return euStandard;
    }
}
