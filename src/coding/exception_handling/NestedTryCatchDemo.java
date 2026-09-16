package coding.exception_handling;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            try {
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch");
            }
        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}
