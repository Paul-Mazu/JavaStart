package polimorfizm.zad2.data;

public class Character {

    private String name;
    private double attack;
    private double defence;
    private double life;

    public Character(String name, int attack, int defence, int life) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefence() {
        return defence;
    }

    public double getLife() {
        return life;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public String printCharacterInfo() {
        return "Name: " + name + ", attac: " + attack + ", defence: " + defence + ", life: " + life;
    }
}
