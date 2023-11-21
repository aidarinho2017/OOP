public abstract class Gadget {
    int age;
    boolean state;
    int brightness;
    int volume;
    int temperature;
    boolean connection;
    Gadget(int age, boolean state, int brightness, int volume, int temperature, boolean connection){
        this.age = age;
        this.state = state;
        this.brightness = brightness;
        this.volume = volume;
        this.temperature = temperature;
        this.connection = connection;
    }
    public void turnOn(){
        this.state = true;
    }

    public void turnOff(){
        this.state = false;
    }

    public int changeBrightness(int num){
        if(this.brightness + num < 0){
            return 0;
        }
        this.brightness += num;
        return this.brightness;
    }

    public int changeVolume(int num){
        if(this.volume + num < 0){
            return 0;
        }
        this.volume += num;
        return this.volume;
    }
    public int changeTemperature(int num){
        this.temperature += num;
        return this.temperature;
    }
    public boolean connect(){
        this.connection = true;
        return true;
    }
    public boolean disconnect(){
        this.connection = false;
        return false;
    }
}
