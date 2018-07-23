// write an enumeration describing the 8 corners of the RGB color cube

object RGBCubeCorner extends Enumeration {
  type RGBCubeCorner = Value
  
  val Black = Value(0x000000)
  val Blue = Value(0x0000ff)
  val Red = Value(0xff0000)
  val Magenta = Value(0xff00ff)
  val Green = Value(0x00ff00)
  val Cyan = Value(0x00ffff)
  val Yellow = Value(0xffff00)
  val White = Value(0xffffff)

}
