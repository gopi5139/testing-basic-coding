package coding.exception_handling;

class MyCustomException extends Exception {
    MyCustomException(String message) { super(message); }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("Custom error");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
