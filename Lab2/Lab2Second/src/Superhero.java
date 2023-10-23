import java.util.Objects;

public class Superhero {
    private final String name;
    private final String ability;
    private final String dna;
    private int age;

    public Superhero(String name, String ability, String dna, int age){
        this.name = name;
        this.ability = ability;
        this.dna = dna;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public String getAbility(){
        return this.ability;
    }
    public String getName(){
        return this.name;
    }
    public String getDna(){
        return this.dna;
    }
    public void becomeOlder(){
        this.age += 1;
    }
    public void whoAreYou(){
        System.out.println("I am a superhero on my own");
    }
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Superhero)) {
            return false;
        }
        return Objects.equals(this.dna, ((Superhero) o).dna);
    }
    public int hashCode() {
        return Objects.hashCode(dna);
    }


}
