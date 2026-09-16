package coding.selenium_programs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReusableTestDataGenerator {
    public static String generateEmail(String userName) {
        String suffix = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return userName + "." + suffix + "@example.com";
    }

    public static void main(String[] args) {
        System.out.println(generateEmail("auto"));
    }
}
