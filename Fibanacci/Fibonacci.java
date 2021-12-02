public class Fibonacci {
    /**
     * Approach DP.
     */
    public static long fibonacci(long n) {
        int index = (int) n;
        if (n <= 1) {
            return n;
        }
        long[] dp = new long[index + 1];
        dp[1] = 1;
        for (int i = 2; i <= index; i++) {
            // dp[i-1] + dp[i-2] = dp[i] > long.max
            if (i > 3 && dp[i - 1] > Long.MAX_VALUE - dp[i - 2]) {
                return Long.MAX_VALUE;
            }
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[index];
    }

}