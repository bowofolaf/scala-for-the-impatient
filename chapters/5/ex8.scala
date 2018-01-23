// make a class car with read-only properties for manufacturer, model name and model year, 
// and a read-write property for the license plate. 
// Supply 4 constructors. All require manufacturer and model name. 
// Optionally model year and license plate can be specified in the constructor. 
// If not model year is set to -1 and license plate to empty string.

class Car(val manufacturer: String, val model: String) {
  private var modelYear: Int = -1
  var licensePlate: String = ""

  def this(manufacturer: String, model: String, modelYear: Int) {
    this(manufacturer, model)
    this.modelYear = modelYear
  }

  def this(manufacturer: String, model: String, modelYear: Int, licensePlate: String) {
    this(manufacturer, model, modelYear)
    this.licensePlate = licensePlate
  }

  def this(manufacturer: String, model: String, licensePlate: String) {
    this(manufacturer, model, licensePlate)
    this.modelYear = modelYear
  }

  def getModelYear = modelYear
}

//**** which constructor are u choosing to be the primary constructor

// class Car(val manufacturer: String, val model: String) because manufacturer and model name are required
