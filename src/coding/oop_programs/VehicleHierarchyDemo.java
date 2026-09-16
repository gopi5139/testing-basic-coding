package coding.oop_programs;

class VehicleBase {
    void start() { System.out.println("Vehicle started"); }
}
class Car extends VehicleBase {
    void drive() { System.out.println("Car driving"); }
}
public class VehicleHierarchyDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}
