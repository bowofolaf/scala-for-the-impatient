import java.lang.System

object solution {
    val username = System.getProperty("user.name")
    val password = System.console().readLine()

    password match {
        case "secret": System.out.println("Welcome " + username)
        case _: System.err.println("Incorrect password")
    }
}