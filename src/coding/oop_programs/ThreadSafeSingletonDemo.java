package coding.oop_programs;

class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {}
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) instance = new ThreadSafeSingleton();
            }
        }
        return instance;
    }
}

public class ThreadSafeSingletonDemo {
    public static void main(String[] args) {
        ThreadSafeSingleton s1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton s2 = ThreadSafeSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
