public class PC extends Gadget implements ConnectableToTheInternet{
    PC(int age, boolean state, int brightness, int volume, int temperature, boolean connection){
        super(age, state, brightness, volume, temperature, connection);
    }

    public String toString() {
        return "This computer is " + this.age + " years old. The state is: " +
                this.state + ", brightness: " + this.brightness + ", volume: " +
                this.volume + ", temperature: " + this.temperature;
    }


}
