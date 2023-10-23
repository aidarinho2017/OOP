import java.util.Objects;

public class Avenger extends Superhero{
    private final String surname;
    private final int id;

    public Avenger(String name, String surname, String ability, String dna, int age, int id){
        super(name, ability, dna, age);
        this.surname = surname;
        this.id=id;
    }
    public String getSurname(){
        return this.surname;
    }
    public void whoAreYou(){
        System.out.println("I am an AVENGEEEER! ");
    }
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Avenger)) {
            return false;
        }
        return Objects.equals(this.id, ((Avenger) o).id);
    }
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
