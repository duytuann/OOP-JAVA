public class Circle extends Shape {
  protected double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * getArea.
   */
  @Override
  public double getArea() {
    return this.radius * this.radius * Math.PI;
  }

  /**
   * getPerimeter.
   */
  @Override
  public double getPerimeter() {
    return 2 * Math.PI * this.radius;
  }


  /**
   * toString.
   */
  @Override
  public String toString() {
    String res = "Circle[radius=" + this.radius + ",color=" + this.color 
                  + ",filled=" + this.filled + "]";
    return res;
  }
}