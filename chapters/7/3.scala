// write a package random

package object random {

  var previous: Double = 0

  val a = 1664525
  val b = 1013904223
  val n = 32

  def setSeed(seed: Int): Unit = previous = seed.toDouble

  def nextDouble(): Double = {
    val next = (previous * a + b) % (2 ^ n)
    previous = next
    next
  }
  def nextInt(): Int = nextDouble.toInt

}

package random {

  object Program extends App {

    setSeed(1234)
    println(nextDouble)
    println(nextInt)
    setSeed(1234)
    println(nextDouble)
  }
}