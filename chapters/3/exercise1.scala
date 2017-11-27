// Write a code snippet that sets a to an array of n random integers
// between 0(inclusive) and n(exclusive)

import scala.util.Random;

def generateRandoms(n: Integer) : Array[Int] = {
    val randomGen = new Random();
    val result = for(i <- 0 until n)
        yield randomGen.nextInt(n)

    result.toArray
}

val a = generateRandoms(5)