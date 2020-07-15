package polimorfizm.zad2.data;

public class Team {

    private final int teamSize = 3;
    private int teamCounter = 0;

    private Character[] team = new Character[teamSize];

    public void addTeamMember(Character character) {
        team[teamCounter] = character;
        teamCounter++;
    }

    public void printTeamInfo() {
        for (Character character: team) {
            System.out.println(character.printCharacterInfo());
        }
    }

    public double sumOfDefence(){
        double defence = 0;
        if (team[0]!=null) {
            for (Character character : team) {
                defence += character.getDefence();
            }
        }else return 0;
        return defence;
    }

    public double sumOfAttack(){
        double attack = 0;
        if (team[0] != null) {
            for (Character character : team) {
                attack += character.getAttack();
            }
        } else return 0;
        return attack;
    }

    public double sumOfLife(){
        double life = 0;
        if (team[0] != null) {
            for (Character character : team) {
                life += character.getLife();
            }
        } else return 0;

        return life;
    }

}
