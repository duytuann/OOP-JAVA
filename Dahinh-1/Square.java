public class Square extends Rectangle {
 public Square() {
 }

 public Square(double side) {
  super(side, side);
 }

 public Square(double side, String color, boolean filled) {
  super(side, side, color, filled);
 }

 /**
  * getSide.
  */
 public double getSide() {
  return this.width;
 }

 /**
  * setSide.
  */
 public void setSide(double side) {
  this.width = side;
  this.length = side;
 }

 /**
  * setWidth.
  */
 @Override
 public void setWidth(double side) {
  this.width = side;
  this.length = side;
 }

 /**
  * setLength.
  */
 @Override
 public void setLength(double side) {
  this.length = side;
  this.width = side;
 }

 /**
  * toString.
  */
 @Override
 public String toString() {
  String res = "Square[side=" + this.width + ",color=" + this.color + ",filled="
                 + this.filled + "]";
  return res;
 }
}
 