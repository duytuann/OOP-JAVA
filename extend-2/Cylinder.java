package extend1;

public class Cylinder extends Circle {

    private double height = 1.0;

    /**
     * constructor.
     */
    public Cylinder() {
    }

    /**
     * constructor.
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * constructor.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * constructor.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * get height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * set height.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * get volume.
     */
    public double getVolume() {
        double ans = height * super.getArea();
        return ans;
    }

    /**
     * to string.
     */
    public String toString() {
        String ans = "Cylinder[" + super.toString() + ",height=" + height + "]";
        return ans;
    }

    /**
     * get area.
     */
    public double getArea() {
        double ans = 2 * PI * super.getRadius() * height + 2 * super.getArea();
        return ans;
    }
}
