public class Boy extends Person implements Runable, PlayFootball{
    int scored;
    int conceded;
    Boy(int age, int handPosition, int legPosition, int headPosition, int scored, int conceded){
        super(age, handPosition, legPosition, headPosition);
        this.scored = scored;
        this.conceded = conceded;
    }
    @Override
    public void scoreGoal() {
        this.scored += 1;
        System.out.println("YEAAAAAHHH ");
    }

    @Override
    public void concedeGoal() {
        this.conceded += 1;
        System.out.println("ughhh... ");
    }

    @Override
    public void run() {
        System.out.println("fuuuuuuuuughh");
    }
    public String toString() {
        return
                "age=" + age +
                ", handPosition=" + handPosition +
                ", legPosition=" + legPosition +
                ", headPosition=" + headPosition +
                ", scored " + scored +
                " goals, conceded " + conceded +
                " goals. ";
    }

}
