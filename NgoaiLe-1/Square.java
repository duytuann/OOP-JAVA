public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * to String.
     */
    @Override
    public String toString() {
        return "(" + expression.toString() + ")" + " ^ 2";
    }

    /**
     * evaluate.
     */
    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
