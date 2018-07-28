// Write a program that copies all elements from a Java HashMap to a Scala HashMap
import java.util.function.BiConsumer
import java.util.{HashMap => JavaHashMap}

import scala.collection.mutable.{HashMap => ScalaHashMap}

object CopyHashMap extends App {

  val javaHashMap = new JavaHashMap[String, String]()
  javaHashMap.put("tiger", "woods")
  javaHashMap.put("michael", "jordan")
  javaHashMap.put("kobe", "bryant")

  var scalaHashMap = ScalaHashMap.empty[String, String]

  javaHashMap.forEach(new BiConsumer[String, String] {
    override def accept(key: String, value: String): Unit = scalaHashMap += (key -> value)
  })

  println(javaHashMap.toString)
}