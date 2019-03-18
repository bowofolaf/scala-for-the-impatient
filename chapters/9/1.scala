// write a scala code snippet that reverses line in a file
import scala.io.Source;

object chapter9question1 {
  val source = Source.fromFile("test.txt", "UTF-8")
  val iterator = source.getLines

  iterator.toBuffer.reverse.foreach(println)
}
