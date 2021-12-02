public class Point {
    private double pointX;
    private double pointY;

    /**
     * constructor point.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return this.pointX;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance d = sqrt(a^2-b^2).
     */
    public double distance(Point other) {
        double a = (this.pointX - other.pointX);
        double b = (this.pointY - other.pointY);
        double res = Math.sqrt(a * a + b * b);
        return res;
    }
}
