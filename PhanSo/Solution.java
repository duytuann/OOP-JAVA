// Import your library
// Do not change the name of the Solution class
public class Solution {
    private int numerator;
    private int denominator = 1;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * set deno != 0.
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            return;
        }
        this.denominator = denominator;
    }

    /**
     * cons deno != 0.
     */
    public Solution(int numerator, int denominator) {
        super();
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * gcd.
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        } else {
            return Math.abs(gcd(b, a % b));
        }
    }

    /**
     * reduce.
     */
    public Solution reduce() {
        int num = gcd(numerator, denominator);
        this.denominator /= num;
        this.numerator /= num;
        return this;
    }

    /**
     * add.
     */
    public Solution add(Solution a) {
        if (a.getDenominator() == 0) {
            return this;
        }
        int x = this.getNumerator() * a.getDenominator() + this.getDenominator() * a.getNumerator();
        int y = this.getDenominator() * a.getDenominator();
        this.setNumerator(x);
        this.setDenominator(y);
        return this;
    }

    /**
     * subtract.
     */
    public Solution subtract(Solution a) {
        if (a.getDenominator() == 0) {
            return this;
        }
        int x = this.numerator * a.denominator - a.numerator * this.denominator;
        int y = this.denominator * a.denominator;
        this.setNumerator(x);
        this.setDenominator(y);
        return this;
    }

    /**
     * multiply.
     */
    public Solution multiply(Solution a) {
        if (a.getDenominator() == 0) {
            return this;
        }
        int x = this.numerator * a.numerator;
        int y = this.denominator * a.denominator;
        this.setNumerator(x);
        this.setDenominator(y);
        return this;
    }

    /**
     * divide.
     */
    public Solution divide(Solution a) {
        if (a.getDenominator() == 0 || a.getNumerator() == 0) {
            return this;
        }
        int x = this.numerator * a.denominator;
        int y = this.denominator * a.numerator;
        this.setNumerator(x);
        this.setDenominator(y);
        return this;
    }

    /**
     * equals.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return other.getNumerator() * this.getDenominator()
                    == other.getDenominator() * this.getNumerator();
        }
        return false;
    }
}