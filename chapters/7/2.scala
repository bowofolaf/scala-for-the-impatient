package com
object Test {
  def toString = println("This is com.Test")
}
package vs
package com {

  object Test {
    def toString = println("This is com.vs.com.Test")
  }

  package enter {

    object Test {
      def toString = {
        com.Test.toString()
      }
    }
  }
}


