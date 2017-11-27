// exercise 2 but produce new array. use for/yield

def swapAdjacent(array: Array[Int]) = {
    val seqInt = for(i <- array.indices by 2)
        yield if(array.isDefinedAt(i + 1)) Array(array(i + 1), array(i)) else Array(array(i))

    seqInt.flatten
}
