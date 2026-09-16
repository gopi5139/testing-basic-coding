package coding.string_programs;

public class CompareTwoStringsWithoutEquals {
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        System.out.println(compareStrings(a, b));
    }
}
