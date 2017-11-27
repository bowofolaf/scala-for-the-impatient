// Write a loop that swaps adjacent elements of an array of integers
// eg Array(1,2,3,4,5) becomes Array(2,1,4,3,5)

def swapAdjacent(array: Array[Int]) = {
    for(i <- array.indices by 2) {
        if(array.isDefinedAt(i + 1)) {
            val adjacent = array(i + 1)
            array(i + 1) = array(i)
            array(i) = adjacent
        }

    }
}