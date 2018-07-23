// Write a scala application, using the App trait that prints its command line args in reverse order separated by spaces

object ReverseApp extends App {
  println(args.reverse.mkString(" "))
}
