public class SmartPhone extends Gadget implements ConnectableToTheInternet, Callable{
    SmartPhone(int age, boolean state, int brightness, int volume, int temperature, boolean connection){
        super(age, state, brightness, volume, temperature, connection);
    }

    public String toString() {
        return "This SmartPhone is " + this.age + " years old. The state is: " +
                this.state + ", brightness: " + this.brightness + ", volume: " +
                this.volume + ", temperature: " + this.temperature;
    }
    public void call(String name){
        System.out.println("I'm calling " + name);
    }


}
