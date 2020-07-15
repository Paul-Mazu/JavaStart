package polimorfizm.zad2.data;

public class Fight {

    private int fightsCounter = 0;

    public void startFight(Team team1, Team team2) {

        double attack_1 = team1.sumOfAttack();
        double attack_2 = team2.sumOfAttack();
        double defence_1 = team1.sumOfDefence();
        double defence_2 = team2.sumOfDefence();
        double life_1 = team1.sumOfLife();
        double life_2 = team2.sumOfLife();

        while (life_1 > 0 && life_2 > 0){
            if (attack_1 - defence_2 > 0) {
                life_2 = life_2 - (attack_1 - defence_2);
            }
            System.out.println("Team 2 Total life: " + life_2);

            if (attack_2 - defence_1 > 0) {
                life_1 = life_1 - (attack_2 - defence_1);
            }
            System.out.println("Team 1 Total life: " + life_1);
            fightsCounter++;
        }
        System.out.println("Odbyło się " + fightsCounter + " walk.");
    }

}
