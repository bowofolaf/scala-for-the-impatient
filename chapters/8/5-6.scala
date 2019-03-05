// 5
class Point(x: Double, y: Double)

class LabeledPoint(label: String, x: Double, y: Double) extends Point(x, y)


// 6
abstract class Shape {
    def centerPoint: Point // from exercise 5
}

class Circle(override val centerPoint: Point, val radius: Double) extends Shape

class Rectangle(topLeft: Point, bottomRight: Point) extends Shape {
    override def centerPoint: Point = {
        new Point(
            (bottomRight.x - topLeft.x)/2,
            (bottomRight.y - topLeft.y)/2
        )
    }
}


