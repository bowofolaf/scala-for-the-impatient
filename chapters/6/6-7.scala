// write an enumeration that describes the 4 playing card suits

object Suit extends Enumeration {

  val Clubs = Value("♣️")
  val Hearts = Value("♥️")
  val Spades = Value("♠️")
  val Diamonds = Value("♦️")

  def isRed(suit: Suit.Value): Boolean = {
    suit match {
      case Hearts | Diamonds => true
      case _ => false
    }
  }
}
