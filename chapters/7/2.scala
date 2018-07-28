package com

object Test {
  def print = println("This is com.Test")
}

package vs {
  package com {

    object Test {
      def print = println("This is com.vs.com.Test")
    }

    package enter {

      object Test {
        def print = {
          com.Test.toString()
        }
      }

    }

  }

}

