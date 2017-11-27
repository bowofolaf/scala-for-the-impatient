// given an array integers, produce a new array that contains all
// +ve values in their original order, followed by 0 or -ve numbers
// in their original order

def positiveFirst(array: Array[Int]) = {
    val positives = for (i <- array.indices if array(i) > 0) yield array(i);
    val negatives = for (i <- array.indices if array(i) <= 0) yield array(i)

    Seq.concat(positives, negatives)
    //positives
}

