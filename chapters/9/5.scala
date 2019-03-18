// write a scala program that writes the powers of 2 and their reciprocals to a file
// with the exponent ranging from 0 to 20.

import scala.io.Source
import java.io.PrintWriter;

object chapter9question5 {

  val out = new PrintWriter("powersOf2.txt")
  val width = 20

  for (i <- 0 to 20) {
    for (i <- 1 to 4) out.print(" ") // left margin of 4 spaces

    val powerOf2 = scala.math.pow(2, i)
    out.print(powerOf2)
    val powerLength = powerOf2.toString.size
    for (i <- 1 to (width - powerLength)) out.print(" ")

    val recicprocal: Double = 1 / powerOf2
    out.println(recicprocal)

  }

  out.close()
}
