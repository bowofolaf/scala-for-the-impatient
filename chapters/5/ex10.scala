// Consider the class

class Employee(val name: String, var salary: Double) {
  def this() { this("John Q. Public", 0.0) }
}

// rewrite it to use explicit fields and a default primary constructor.

class Employee {
  private var privateName: String = "John Q. Public"
  var salary: Double = 0.0

  def name = privateName

  def this(name: String, salary: Double) = {
      this()
      this.privateName = name
      this.salary = salary
  }
}

//**which do you prefer.

// is this even a question? gross. there is power in having a val in your constructor
