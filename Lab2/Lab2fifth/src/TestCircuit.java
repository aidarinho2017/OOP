public class TestCircuit {
    public static void main(String[] args) {

        Circuit a = new Resistor(2.0);
        Circuit b = new Resistor(2.0);
        Circuit c = new Resistor(9.0);
        Circuit d = new Resistor(1.0);
        Circuit e = new Resistor(9.0);
        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        circuit.applyPotentialDiff(8);
        circuit.applyPotentialDiff(10);


        System.out.println(circuit.getResistance());
        System.out.println(circuit.getPotentialDiff());
        System.out.println(circuit.getCurrent());
        System.out.println(circuit.getPower());
    }
}
