package constructionSuper;

public class Fruit {

    private int weight;
    private String type;

    public Fruit(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getInfo() {
        System.out.println("Typ: " + type + ", Waga: " + weight);
    }
}
