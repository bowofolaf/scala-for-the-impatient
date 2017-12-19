// repeat preceeding exercise with a sorted map

import scala.io.Source

val file = Source.fromFile("somewords.txt")
val words = 
    file.mkString
    .split("\\s+")
    .map(_.replaceAll("\\P{Alnum}", ""))
    .filter(_.nonEmpty)

var wordCount = scala.collection.SortedMap[String, Int]()

for(word <- words) {
    var previousCount = 0
    if(wordCount.contains(word))
        previousCount = wordCount(word)
    
    wordCount += (word -> (previousCount + 1))
    
}

wordCount
