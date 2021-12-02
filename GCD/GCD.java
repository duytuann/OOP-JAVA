public class GCD {
    /**
     * find the gcd of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        } else {
            return Math.abs(gcd(b, a % b));
        }
    }
}
