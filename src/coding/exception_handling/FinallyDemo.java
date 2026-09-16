package coding.exception_handling;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
