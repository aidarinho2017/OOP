

public class Resistor extends Circuit{

    private double value;
    private double pottentialDifference;

    public Resistor(double value)
    {
        this.value = value;
        this.pottentialDifference = 0;
    }
    public double getResistance() {
        return this.value;
    }
    public double getPotentialDiff() {
        return this.pottentialDifference;
    }
    public void applyPotentialDiff(double V) {
        this.pottentialDifference = V;
    }
    public void setResistance(double newValue)
    {
        this.value = newValue;
    }
    public double getPottentialDifference()
    {
        return this.pottentialDifference;
    }
    public void setPottentialDifference(double pottentialDifference)
    {
        this.pottentialDifference = pottentialDifference;
    }

}