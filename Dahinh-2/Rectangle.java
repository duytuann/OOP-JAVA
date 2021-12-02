import java.util.Objects;

public class Rectangle extends Shape {

	protected double width;
	protected double length;
	protected Point topLeft;

	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}

	public Rectangle(Point point, double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
		this.topLeft = point;
	}

	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return this.width * this.length;
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.width + this.length);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof Rectangle)) {
			return false;
		}
		Rectangle rectangle = (Rectangle) object;
		return topLeft.equals(rectangle.topLeft) && Double.compare(rectangle.width, width) == 0
				&& Double.compare(rectangle.length, length) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(width, length, topLeft);
	}

	@Override
	public String toString() {
		return "Rectangle[topLeft=" + topLeft.toString() + ",width=" + width + ",length=" + length + ",color=" + color
				+ ",filled=" + filled + "]";
	}
}
