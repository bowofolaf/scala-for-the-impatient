class Square(topRight: Point, width: Int) 
extends java.awt.Rectangle(width, width, topRight.x, topRight.y) {

    this(width: Int):Square = this(new Point(0, 0), width)

    this():Square = this(0)
}