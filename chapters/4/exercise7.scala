// print a table of all java properties reported by getProperties in a tabbed table

import scala.collection.JavaConversions.propertiesAsScalaMap

val properties: scala.collection.mutable.Map[String, String] = System.getProperties

val longestKey = properties.keys.reduceLeft(
  (current, previous) => if(current.length > previous.length) current else previous
)

for((k,v) <- properties) {
  println(s"${k.padTo(longestKey.size + 6, " ").mkString}| ${v}")
}

