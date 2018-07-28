// Write a program that copies all elements from a Java HashMap to a Scala HashMap
import java.util.function.BiConsumer

object CopyHashMap2 extends App {

  val javaHashMap = {
    import java.util.HashMap
    val hashMap = new HashMap[String, String]()
    hashMap.put("tiger", "woods")
    hashMap.put("michael", "jordan")
    hashMap.put("kobe", "bryant")
    hashMap
  }

  import scala.collection.mutable.HashMap
  var scalaHashMap = HashMap.empty[String, String]

  javaHashMap.forEach(new BiConsumer[String, String] {
    override def accept(key: String, value: String): Unit = scalaHashMap += (key -> value)
  })

  println(javaHashMap.toString)
}