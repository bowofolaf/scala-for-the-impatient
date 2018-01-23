// improve the Counter class in section 5.1 so that it doesn't turn negative at Int.MaxValue
class Counter {
  private var value = 0
  def increment() { 
    if(value < Int.MaxValue) {
      value += 1
    }
  }
  def current() = value
}
