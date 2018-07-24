package com.horstmann.impatient

object Test1 {
  def print(): Unit = {
    println("This is Test1")
    //println(horstmann.Horstmann) // this fails to compile
    import com.horstmann._ // you have to import it
    println(Horstmann)

  }
}
