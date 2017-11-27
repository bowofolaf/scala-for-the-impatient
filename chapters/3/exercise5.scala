/* how do you compute the average of an Array[Double]
*/

def average(list:Array[Double]):Double = {
    if(list.isEmpty) 0 else list.sum/list.length
}