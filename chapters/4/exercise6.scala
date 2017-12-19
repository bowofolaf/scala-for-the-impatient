// define a linked hash map that maps "monday" to java.util.Calendar.MONDAY
// and similarly for other weekdays. Demonstrate that the elements are visited in insertion
// order

val dayMap = scala.collection.mutable.LinkedHashMap[String, Any]()
dayMap += ("MONDAY" -> java.util.Calendar.MONDAY)
dayMap += ("TUESDAY" -> java.util.Calendar.TUESDAY)
dayMap += ("WEDNESDAY" -> java.util.Calendar.WEDNESDAY)
dayMap += ("THURSDAY" -> java.util.Calendar.THURSDAY)
dayMap += ("FRIDAY" -> java.util.Calendar.FRIDAY)
dayMap += ("SUNDAY" -> java.util.Calendar.SUNDAY)
dayMap += ("SATURDAY" -> java.util.Calendar.SATURDAY)

for((k,v) <- dayMap) {
    println(k)
}
