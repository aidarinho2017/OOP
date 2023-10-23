package Lab1second;
public class test2 {
    public static void main(String[] args) {
        Footballer player = new Footballer(1987, "Messi");
        player.action(Goals.Brace);
        player.action(Goals.Brace);
        player.action(4, 5);
        player.action(4, 5);
        player.action(4, 5);
        int totalGoals = player.getNumOfGoals();
        int fouls = player.getNumOfFouls();
        int assists = player.getNumOfAssists();
        System.out.println(player.name + " has scored " + totalGoals + " goals. Number of Fouls is " + fouls + " Amount of Assists: " + assists + " He was born in " + player.getYear());
        Footballer p = new Footballer(1985, "Ronaldo");
        p.action(Goals.Goal);
        p.action(Goals.HatTrick);
        p.action(4, 1);
        p.action(3, 1);
        p.action(4, 4);
        int t = p.getNumOfGoals();
        int f = p.getNumOfFouls();
        int a = p.getNumOfAssists();
        System.out.println(p.name + " has scored " + t + " goals. Number of Fouls is " + f + " Amount of Assists: " + a + " He was born in " + p.getYear());
        System.out.println("They scored "+ p.commonGoals);
    }
}

