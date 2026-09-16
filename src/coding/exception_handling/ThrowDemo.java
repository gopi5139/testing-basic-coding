package coding.exception_handling;

public class ThrowDemo {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        validateAge(15);
    }
}
