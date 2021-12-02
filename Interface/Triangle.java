public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * constructor (throw exception).
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
            throw new RuntimeException("Runtime exception !!");
        } else if (p1.distance(p2) == p1.distance(p3) + p3.distance(p2)
                        || p1.distance(p3) == p1.distance(p2) + p2.distance(p3)
                        || p2.distance(p3) == p2.distance(p1) + p1.distance(p3)) {
            throw new RuntimeException("Runtime exception !!");
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    /**
     * get Area.
     */
    @Override
    public double getArea() {
        double ans = Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                        + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                        + p3.getPointX() * (p1.getPointY() - p2.getPointY()));
        ans /= 2;
        return ans;
    }

    /**
     * get Perimeter.
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * getInfo.
     */
    @Override
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                        p1.getPointX(), p1.getPointY(), p2.getPointX(),
                        p2.getPointY(), p3.getPointX(), p3.getPointY());
    }
}
