public class Multiplication extends BinaryExpression {
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * to String.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    /**
     * evaluate.
     */
    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
