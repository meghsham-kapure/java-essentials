package CoreJavaTopics.java8_features.jf13_defaultstaticmethods;

// Default and Static methods in Interfaces
interface Vehicle {
    // Traditional abstract method
    String getBrand();
    
    // Default method - new in Java 8
    default String turnAlarmOn() {
        return "Turning vehicle alarm on.";
    }
    
    default String turnAlarmOff() {
        return "Turning vehicle alarm off.";
    }
    
    // Static method - new in Java 8
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}

class Car implements Vehicle {
    private String brand;
    
    public Car(String brand) {
        this.brand = brand;
    }
    
    @Override
    public String getBrand() {
        return brand;
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        
        // Calling static method
        System.out.println("Horsepower: " + Vehicle.getHorsePower(6000, 480));
    }
}
