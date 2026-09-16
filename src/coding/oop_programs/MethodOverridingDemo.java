package coding.oop_programs;

class Parent {
    void display() { System.out.println("Parent display"); }
}

class Child extends Parent {
    @Override
    void display() { System.out.println("Child display"); }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
    }
}
