import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return this.pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point point) {
        double dis = Math.sqrt(Math.pow(point.pointX - pointX, 2) + Math.pow(point.pointY - pointY, 2));
        return dis;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Point)) {
            return false;
        }
        Point other = (Point) object;
        return Double.compare(this.pointX, other.pointX) == 0 && Double.compare(this.pointY, other.pointY) == 0;
    }

    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    public String toString() {
        return "(" + this.pointX + "," + this.pointY + ")";
    }
}
