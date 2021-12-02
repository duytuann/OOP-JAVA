import java.util.Objects;

public class Circle extends Shape {
	protected double radius;
	protected Point center;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle(Point center, double radius, String color, boolean filled) {
		super(color, filled);
		this.center = center;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Circle)) {
			return false;
		}
		Circle other = (Circle) object;
		return Double.compare(other.radius, this.radius) == 0 && this.center.equals(this.center);
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius, center);
	}

	@Override
	public String toString() {
		return "Circle[center=" + center.toString() + ",radius=" + radius + ",color=" + color + ",filled=" + filled
				+ "]";
	}
}
