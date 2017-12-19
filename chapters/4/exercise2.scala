// write a program that reads words from a file and count how often word appears using a mutable map
import scala.io.Source

val file = Source.fromFile("somewords.txt")
val words = 
    file.mkString
    .split("\\s+")
    .map(_.replaceAll("\\P{Alnum}", ""))
    .filter(_.nonEmpty)

val wordCount = scala.collection.mutable.Map[String, Int]().withDefaultValue(0)

for(word <- words) wordCount(word) += 1

wordCount

