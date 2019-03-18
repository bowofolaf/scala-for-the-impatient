// Write a scala program that reads a file containing floating point numbers
//  Print the sum, avg, max and min

import scala.io.Source

object chapter9question4 {

  val source = Source.fromFile("numbers.txt", "UTF-8")
  val numbers = source.mkString.split("\\s+").map(_.toDouble).sorted

  source.close

  println(s"Sum: ${numbers.sum}")
  println(s"Avg: ${numbers.sum / numbers.size}")
  println(s"Min: ${numbers.head}")
  println(s"Max: ${numbers.last}")
}
