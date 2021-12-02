public class Rectangle extends Shape {
 protected double width;
 protected double length;

 public Rectangle() {
 }

 public Rectangle(double width, double length) {
  this.width = width;
  this.length = length;
 }

 /**
  * Constructor.
  */
 public Rectangle(double width, double length, String color, boolean filled) {
  super(color, filled);
  this.width = width;
  this.length = length;
 }

 public double getWidth() {
  return width;
 }

 public void setWidth(double width) {
  this.width = width;
 }

 public void setLength(double length) {
  this.length = length;
 }

 public double getLength() {
  return length;
 }

 /**
  * getArea.
  */
 @Override
 public double getArea() {
  return this.width * this.length;
 }

 /**
  * getPerimeter.
  */
 @Override
 public double getPerimeter() {
  return 2 * (this.width + this.length);
 }

 /**
  * toString.
  */
 @Override
 public String toString() {
  String res = "Rectangle[width=" + this.width + ",length=" + this.length + ",color="
                    + this.color + ",filled=" + this.filled + "]";
  return res;
 }
}
 