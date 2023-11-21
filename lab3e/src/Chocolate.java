public class Chocolate implements Comparable<Chocolate>{
    String name;
    int weight;
    public Chocolate(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return "This cholocate's name is: " + this.name + " and it weighs " + this.weight + "g.";
    }


    @Override
    public int compareTo(Chocolate o) {
        return Integer.compare(this.weight, o.weight);
    }
}
