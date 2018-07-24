package com
package horstmann
package impatient

// this opens up access to anything contained in com, and horstmann

object Test2 {
  def print(): Unit = {
    println("This is Test2")
    println(Horstmann)
  }
}