// repeat preceeding exercise with an immutable map

import scala.io.Source

val file = Source.fromFile("somewords.txt")
val words = 
    file.mkString
    .split("\\s+")
    .map(_.replaceAll("\\P{Alnum}", ""))
    .filter(_.nonEmpty)

var wordCount = Map[String, Int]().withDefaultValue(0)

for(word <- words) wordCount += (word -> (wordCount(word) + 1))

wordCount