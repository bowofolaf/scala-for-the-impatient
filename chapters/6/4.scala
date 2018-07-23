// define a Point class with a companion object
class Point(x: double, y: double) {

}

object Point {
  def apply(x: double, y: double): Point = new Point(x, y)
}