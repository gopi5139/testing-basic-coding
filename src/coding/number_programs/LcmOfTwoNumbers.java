package coding.number_programs;

public class LcmOfTwoNumbers {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }
}
