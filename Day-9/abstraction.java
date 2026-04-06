abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();
    void deviceInfo(){
        System.out.println("It is a Device");
    }
}
class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("Light ON");
    }
    @Override
    void turnOff(){
        System.out.println("Light OFF");
    }
}
public class abstraction {
    public static void main(String[] args) {
        
    
    SmartDevice device=new Light(); // object only created for child class
    device.turnOn();
    device.turnOff();
    device.deviceInfo();
}
}