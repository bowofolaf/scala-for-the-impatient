// write a function minmax(values: Array[Int]) that returns 
//a pair containing the smallest and largest values in the array

def minmax(values: Array[Int]): (Int,Int) = {
  var smallest , largest = values(0)
  values.foreach((value) => {
    if(value > largest) largest = value
    if(value < smallest) smallest = value
  })
  (smallest, largest)
}
