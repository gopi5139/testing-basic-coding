package coding.multithreading;

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Runnable thread running");
        Thread thread = new Thread(task);
        thread.start();
    }
}
