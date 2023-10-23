public class Parallel extends Circuit{
    private Resistor total;
    public Parallel(Circuit a, Circuit b){
        total = new Resistor(a.getResistance()*b.getResistance()/(a.getResistance()+b.getResistance()));
    }
    public double getResistance() {
        return total.getResistance();
    }
    public double getPotentialDiff() {
        return total.getPottentialDifference();
    }
    public void applyPotentialDiff(double V) {
        total.applyPotentialDiff(V);
    }
}
