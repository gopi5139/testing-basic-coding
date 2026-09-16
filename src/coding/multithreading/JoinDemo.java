package coding.multithreading;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> System.out.println("Thread started"));
        t.start();
        t.join();
        System.out.println("Main thread continues");
    }
}
