package coding.oop_programs;

class Vehicle {
    void move() { System.out.println("Vehicle moves"); }
}

class Bike extends Vehicle {
    @Override
    void move() { System.out.println("Bike moves"); }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.move();
    }
}
