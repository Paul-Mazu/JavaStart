package polimorfizm.zad2.data;

public class GameApp {
    public static void main(String[] args) {

        Team team1 = new Team();
        Team team2 = new Team();
        Fight fight = new Fight();

        Character elf1 = new Elf("Master Elf", 20, 20, 100);
        ((Elf)elf1).attactIncrease();
        Character elf2 = new Elf("Super Elf", 20, 20, 100);
        Character knight = new Knight("Super Knight", 20, 20, 100);

        Character knight1 = new Knight("Extra Knight", 20, 20, 100);
        Character knight2 = new Knight("Just Knight", 20, 20, 100);
        Character elf3 = new Elf("Just Elf", 20, 20, 100);

        team1.addTeamMember(elf1);
        team1.addTeamMember(elf2);
        team1.addTeamMember(knight);

        team2.addTeamMember(knight1);
        team2.addTeamMember(knight2);
        team2.addTeamMember(elf3);

        team1.printTeamInfo();
        team2.printTeamInfo();

        fight.startFight(team1, team2);
    }
}
