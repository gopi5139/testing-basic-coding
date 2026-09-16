package coding.exception_handling;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) { super(message); }
}

public class InvalidAgeExceptionDemo {
    public static void main(String[] args) {
        try {
            int age = 10;
            if (age < 18) throw new InvalidAgeException("Age must be 18 or above");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
