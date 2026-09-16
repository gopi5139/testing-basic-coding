package coding.exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedVsUncheckedExceptionsDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("missing.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception handled");
        }
        int x = 10 / 0;
    }
}
