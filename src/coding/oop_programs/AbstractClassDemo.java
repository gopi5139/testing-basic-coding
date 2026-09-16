package coding.oop_programs;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() { System.out.println("Drawing circle"); }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
