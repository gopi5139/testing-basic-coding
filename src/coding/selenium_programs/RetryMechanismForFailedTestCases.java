package coding.selenium_programs;

public class RetryMechanismForFailedTestCases {
    public static void retry(Runnable action, int attempts) {
        for (int i = 1; i <= attempts; i++) {
            try {
                action.run();
                return;
            } catch (Exception e) {
                if (i == attempts) {
                    throw e;
                }
            }
        }
    }
}
