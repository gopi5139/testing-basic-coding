package coding.automation_programs;

import java.util.Random;

public class GenerateRandomPhoneNumber {
    public static void main(String[] args) {
        Random random = new Random();
        String phone = "+1-" + (1000000000 + random.nextInt(900000000));
        System.out.println(phone);
    }
}
