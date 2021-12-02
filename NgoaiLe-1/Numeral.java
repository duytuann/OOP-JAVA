public class Numeral extends Expression {
    private double value;

    public Numeral(double value) {
        this.value = value;
    }

    public Numeral() {
    }

    /**
     * to String.
     */
    @Override
    public String toString() {
        if (value == (long) value) {
            return String.valueOf((long) value);
        }
        return String.valueOf(value);
    }

    /**
     * evaluate.
     */
    @Override
    public double evaluate() {
        return value;
    }
}
