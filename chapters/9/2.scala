// write a scala program that reads a file with tabs, replaces each tab with spaces so that tab stops
// are at n column boundaries. and writes the result to the same file

import scala.io.Source;
import java.io.PrintWriter;

object chapter9question2 {

    val source = Source.fromFile("tabs.txt", "UTF-8")

    val out = new PrintWriter("spaces.txt")

    for (char <- source) {
        val outChar = if (char == '\t') "  " else char
        out.print(outChar)
    }

    source.close()
    out.close()

}
