package coding.multithreading;

public class ThreadUsingLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Lambda thread running"));
        thread.start();
    }
}
