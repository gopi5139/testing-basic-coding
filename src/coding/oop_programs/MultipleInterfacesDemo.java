package coding.oop_programs;

interface Walkable { void walk(); }
interface Runnable { void run(); }

class Human implements Walkable, Runnable {
    public void walk() { System.out.println("Walking"); }
    public void run() { System.out.println("Running"); }
}

public class MultipleInterfacesDemo {
    public static void main(String[] args) {
        Human human = new Human();
        human.walk();
        human.run();
    }
}
