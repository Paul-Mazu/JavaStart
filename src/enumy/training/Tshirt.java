package enumy.training;

public class Tshirt {

    private Size size;


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tshirt " + size.getDescription();
    }
}
