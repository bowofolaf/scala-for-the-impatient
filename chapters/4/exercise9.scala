// write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing
// the counts of values larger than v, equal to v and greater than v

def lteqgt(values: Array[Int], v: Int) = {
  var lt, gt, eq = 0
  values.foreach((value) => {
    if(value < v) lt += 1
    else if(value > v) gt += 1
    else if(value == v) eq += 1
  })

  (lt, eq, gt)
}
