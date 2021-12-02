public abstract class Shape {
 protected String color;
 protected boolean filled;

 public Shape() {
 }

 public Shape(boolean filled) {
  this.filled = filled;
 }

 public Shape(String color, boolean filled) {
  this.color = color;
  this.filled = filled;
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 /**
  * isFilled.
  */
 public boolean isFilled() {
  return filled;
 }

 /**
  * setFilled.
  */
 public void setFilled(boolean filled) {
  this.filled = filled;
 }

 public abstract double getArea();

 public abstract double getPerimeter();

 public String toString() {
  String res = "Shape[color=" + this.color + ",filled=" + this.filled + "]";
  return res;
 }
}
 