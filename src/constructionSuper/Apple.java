package constructionSuper;

public class Apple extends Fruit {

    private final static String TYPE = "Jableczko";
    private String kind;

    public Apple(int weight, String kind) {
        super(weight, TYPE);
        this.kind = kind;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Rodzaj: " + kind);
    }

}
