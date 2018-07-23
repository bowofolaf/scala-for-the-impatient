// For the preceding example, provide a general super-class UnitConversion and define objects InchesToCentimeters, GallonsToLiters and MilesToKilometers that extend it

abstract class UnitConversion {
  def convert(value: Double): Double
}

object InchesToCentimeters extends UnitConversion {
  override def convert(value: Double) = value * 2.54
}

object GallonsToLiters extends UnitConversion {
  override def convert(value: Double) = value * 3.79
}

object MilesToKilometers extends UnitConversion {
  override def convert(value: Double) = value * 1.61
}
