package Lab1second;

public class Footballer {
    final int dateOfBirth;
    final String name;
    int numOfAssists;
    int numOfGoals;
    int numOfFouls;
    static int commonGoals;
    {
        this.numOfGoals = 0;
        this.numOfFouls = 0;
    	
    }

    Footballer(int year, String s) {
        dateOfBirth = year;
        name = s;
    }

    public void action(Goals amountOfGoals) {
        if (amountOfGoals == Goals.Goal) {
            numOfGoals += 1;
            commonGoals+=1;
        } else if (amountOfGoals == Goals.Brace) {
            numOfGoals += 2;
            commonGoals+=2;
        } else if (amountOfGoals == Goals.HatTrick) {
            commonGoals += 3;
            numOfGoals+=3;
        }
    }
    public void action(int fouls, int assists) {
    	numOfFouls+=fouls;
    	numOfAssists+=assists;
    }
    public int getYear() {
    	return dateOfBirth;
    }

    public int getNumOfGoals() {
        return numOfGoals;
    }
    public int getNumOfFouls() {
    	return numOfFouls;
    }
    public int getNumOfAssists(){
    	return numOfAssists;
    }

    public static void main(String[] args) {
        
    }
}

