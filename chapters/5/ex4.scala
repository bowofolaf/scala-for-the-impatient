// Reimplement the class from the previous example so that the 
// internal representation is the number of minutes since midnight (0 - 24 x 60 - 1)
// do not change the public interface

class Time(val hours: Int, val minutes: Int) {
  if(hours < 0 || hours > 23)
    throw new IllegalArgumentException(s"$hours hours is not acceptable. Hours must be in military format!")
  if(minutes < 0 || minutes > 59)
    throw new IllegalArgumentException(s"$hours hours is not acceptable. Hours must be in military format!")

  val minutesSinceMidnight = (hours * 60) + minutes

  def before(other: Time): Boolean = {
    if(minutesSinceMidnight < other.minutesSinceMidnight)
      true
    else
      false
  }
}
