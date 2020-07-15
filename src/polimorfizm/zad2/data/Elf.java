package polimorfizm.zad2.data;

public class Elf extends Character {

    private final double attactBonus = 0.2;
    private final double defenceBonus = 0.2;

    public Elf(String name, int attack, int defence, int life) {
        super(name, attack, defence, life);
    }

    public double getAttactBonus() {
        return attactBonus;
    }

    public void attactIncrease() {
        setAttack(getAttack() + getAttack() * attactBonus);
    }

    public double defenceIncrease() {
        return defenceBonus * getDefence();
    }

    @Override
    public String printCharacterInfo() {
        return super.printCharacterInfo();
    }


}
