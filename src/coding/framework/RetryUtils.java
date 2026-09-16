package coding.framework;

public class RetryUtils {
    public static void retry(Runnable action, int maxAttempts) {
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                action.run();
                return;
            } catch (Exception e) {
                if (attempt == maxAttempts) {
                    throw e;
                }
            }
        }
    }
}
