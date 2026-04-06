abstract class SmartDevice{
    int device;
    abstract void turnOn();
    abstract void turnOff();
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
// public class abstraction {
   
        
    
//     SmartDevice device=new Light(); // object only created for child class
//     device.turnOn();
//     device.turnOff();
//     device.deviceInfo();
// }

public class SmartHome {
    public static void main(String[] args) {
        
    
    SmartDevice device=new Light(); // object only created for child class
    device.turnOn();
    device.turnOff();
   
}
}

