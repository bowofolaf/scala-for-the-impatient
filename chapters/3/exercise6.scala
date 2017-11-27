/* how do you rearrange elements of an Array[Int] so they appear in
reverse sorted order? How do you do the same with an ArrayBuffer[Int]
*/

def reverseSorted(list:Array[Int]): Array[Int] = {
    list.sorted.reverse
}

import scala.collection.mutable.ArrayBuffer

def reverseSorted(buffer:ArrayBuffer[Int]): ArrayBuffer[Int] = {
    buffer.sorted.reverse
}