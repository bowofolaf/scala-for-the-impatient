/*
improve ex8 solution by collecting the positions that should be moved and their target positions. 
Make those moves and truncate the buffer. Dont copy any elements before the first unwanted element
*/

import scala.collection.mutable.ArrayBuffer


var buf = new ArrayBuffer[Int]
buf += (1, 3, 12, 3, 3, -3, 4, 2, -7, 4, 5, 3, -8)
//buf += (1, 3, 12, 3, 3, 4, 2, 4, 5, 3, 10)
val firstNegativeIndex = buf.indices.find(buf(_) < 0)
firstNegativeIndex match {
    case Some(index) => {
        val positionsToKeep = for(i <- buf.indices if i > index && buf(i) >= 0) yield i
        for(j <- positionsToKeep.indices) buf(j + index + 1) = buf(positionsToKeep(j))
        buf.trimEnd(buf.length - (positionsToKeep.length + index + 1))
    }
    case None => 
}
buf
