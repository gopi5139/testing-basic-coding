package coding.multithreading;

class SharedResource {
    synchronized void print(String message) {
        System.out.print("[" + message + "]");
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(() -> resource.print("A"));
        Thread t2 = new Thread(() -> resource.print("B"));
        t1.start();
        t2.start();
    }
}
