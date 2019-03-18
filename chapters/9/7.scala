// write a scala program that reads a text file and prints all tokens that are non floating point numbers
// using regular expressions

import scala.io.Source

object chapter9ex7 {

  val floatingNumber = """\d+\.\d+"""

  val src = Source
    .fromFile("test.txt", "UTF-8")

  src.getLines
    .foreach(
      line =>
        line.split("\\s+").filter(!_.matches(floatingNumber)).foreach(println)
    )

  src.close

}
