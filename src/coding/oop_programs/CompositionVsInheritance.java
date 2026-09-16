package coding.oop_programs;

class Engine { void start() { System.out.println("Engine started"); } }
class CarWithEngine {
    private Engine engine = new Engine();
    void startCar() { engine.start(); }
}
public class CompositionVsInheritance {
    public static void main(String[] args) {
        CarWithEngine car = new CarWithEngine();
        car.startCar();
    }
}
