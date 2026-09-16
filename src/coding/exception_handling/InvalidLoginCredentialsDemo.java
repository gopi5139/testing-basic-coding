package coding.exception_handling;

class InvalidLoginCredentialsException extends Exception {
    InvalidLoginCredentialsException(String message) { super(message); }
}

public class InvalidLoginCredentialsDemo {
    public static void main(String[] args) {
        String user = "admin";
        String pass = "wrong";
        try {
            if (!user.equals("admin") || !pass.equals("admin")) throw new InvalidLoginCredentialsException("Invalid login credentials");
        } catch (InvalidLoginCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}
