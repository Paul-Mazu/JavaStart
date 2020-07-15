package polimorfizm.zad2.data;

public class Knight extends Character{

    private final double defenceBonus = 0.2;
    private final double attacBonus = 0.2;

    public Knight(String name, int attack, int defence, int life) {
        super(name, attack, defence, life);
    }

    public double getDefenceBonus() {
        return defenceBonus;
    }

    public double defenceIncrease() {
        return defenceBonus * getDefence();
    }

    public double attacIncrease() {
        return attacBonus * getAttack();
    }

    @Override
    public String printCharacterInfo() {
        return super.printCharacterInfo();
    }
}
