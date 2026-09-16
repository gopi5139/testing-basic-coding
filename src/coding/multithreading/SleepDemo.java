package coding.multithreading;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread woke up after 1 second");
    }
}
