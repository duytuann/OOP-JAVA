public class Circle implements GeometricObject {
    private double radius;
    private Point center;
    public static final double PI = 3.14;

    /**
     * constructor circle.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getArea circle.
     */
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    /**
     * getPerimeter circle.
     */
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]", 
                center.getPointX(), 
                center.getPointY(), 
                this.radius);
    }
}
