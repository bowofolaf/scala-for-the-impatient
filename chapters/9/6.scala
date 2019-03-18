//Make a regular expression searching for quoted Strings "like this, maybe with \" or \\".
//Write a scala program that prints such strings in a source file

import scala.io.Source

object chapter9question6 {

  val source = Source.fromFile("SomeClassForParsing.java", "UTF-8")

  val regex = "\".*\"".r
  regex.findAllIn(source.mkString).foreach(println)

  source.close

}
