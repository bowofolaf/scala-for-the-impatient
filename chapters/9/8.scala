// write a program that prints the src attributes of all image tags in a html file

import scala.io.Source

object chapter9ex8 {

  def run() {
    val imgTag = """<img[^>]*src="([^\s]*)"[^>]*>""".r

    val source = Source.fromFile("page.html", "UTF-8")

    imgTag
      .findAllMatchIn(source.mkString)
      .foreach { m =>
        println(m.group(1))
      }

      source.close

  }
}
