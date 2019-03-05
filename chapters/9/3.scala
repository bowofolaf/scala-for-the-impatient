// write a scala code snippet that reads a file and prints all words with more than 12 characters to the console

import scala.io.Source

object chapter9question3 {

    Source.fromFile("test.txt", "UTF-8").getLines.foreach(line => line.split("\\s+").filter(w => w.size > 12).foreach(println))

}
