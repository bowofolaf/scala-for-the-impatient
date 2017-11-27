/* suppose you are given an array buffer of integers
and want to remoev all but the first negative number. 
Write it by collecting positions of negative elements,
dropping the first element, reversing the sequence, 
and calling a.remove(i) for each index */

/*
var first = true
var n = buf.length
var i = 0
while(i < n) {
    if(buf(i) >= 0) i += 1
    else {
        if(first) { first = false; i += 1}
        else { buf.remove(i); n -= 1 }
    }
}
*/
import scala.collections.mutable.ArrayBuffer


var buf = new ArrayBuffer[Int]
buf += (1, 3, 12, 3, 3, -3, 4, 2, -7, 4, 5, 3, -8)
val negativePositions = for(i <- buf.indices if buf(i) < 0) yield i
for(i <- negativePositions.tail.reverse) buf.remove(i)
buf

