public class Square extends Rectangle {
	public Square() {
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double size, String color, boolean filled) {
		super(size, size, color, filled);
	}

	public Square(Point point, double size, String color, boolean filled) {
		super(point, size, size, color, filled);
	}

	public double getSide() {
		return super.length;
	}

	public void setSide(double side) {
		this.width = side;
		this.length = side;
	}

	@Override
	public void setWidth(double side) {
		this.width = side;
		this.length = side;
	}

	@Override
	public void setLength(double side) {
		this.width = side;
		this.length = side;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Rectangle)) {
			return false;
		}
		Rectangle rectangle = (Rectangle) o;
		return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.length, length) == 0
				&& topLeft.equals(rectangle.topLeft);
	}

	@Override
	public String toString() {
		return "Square[topLeft=" + topLeft.toString() + ",side=" + this.getSide() + ",color=" + color + ",filled="
				+ filled + "]";
	}
}
