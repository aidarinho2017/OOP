public class TestGadget {
    public static void main(String[] args){
        PC Aider = new PC(2, true, 12, 14, 56, false);
        Aider.changeBrightness(-11);
        Aider.turnOff();
        System.out.println(Aider.toString());
        SmartPhone iPhone15 = new SmartPhone(0, true, 10, 10, 10, false);
        iPhone15.call("Madina");
        System.out.println(iPhone15.toString());
    }
}
