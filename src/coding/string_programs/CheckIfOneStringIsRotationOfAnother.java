package coding.string_programs;

public class CheckIfOneStringIsRotationOfAnother {
    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        return (str1 + str1).contains(str2);
    }

    public static void main(String[] args) {
        String a = "ABC";
        String b = "BCA";
        System.out.println("Is rotation: " + isRotation(a, b));
    }
}
