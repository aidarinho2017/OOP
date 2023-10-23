public class Series extends Circuit{
    Circuit a, b;
    private Resistor total;
    public Series(Circuit a, Circuit b){
        total = new Resistor(a.getResistance()+b.getResistance());
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
