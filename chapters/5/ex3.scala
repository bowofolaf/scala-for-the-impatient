// write a class Time with readonly properties hours and minutes and a method before(other: Time): Boolean that checks whether this time comes before the other time.
// A Time object should be constructed as new Time(hrs, min) where hrs is in military time format(0-23)

class Time(val hours: Int, val minutes: Int) {
  if(hours < 0 || hours > 23)
    throw new IllegalArgumentException(s"$hours hours is not acceptable. Hours must be in military format!")

  def before(other: Time): Boolean = {
    if(hours < other.hours)
      true
    else if(hours == other.hours && minutes < other.minutes)
      true
    else
      false
  }
}
