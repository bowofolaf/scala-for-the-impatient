// repeat preceeding exercise with a java.util.TreeMap

import scala.io.Source
import scala.collection.JavaConversions.mapAsScalaMap

val file = Source.fromFile("somewords.txt")
val words = 
    file.mkString
    .split("\\s+")
    .map(_.replaceAll("\\P{Alnum}", ""))
    .filter(_.nonEmpty)

var wordCount: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]

for(word <- words) {
    var previousCount = 0
    if(wordCount.contains(word))
        previousCount = wordCount(word)
    
    wordCount += (word -> (previousCount + 1))
    
}

wordCount
