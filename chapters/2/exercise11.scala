import java.time.LocalDate;

implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
        if(args.length != 3) throw new IllegalArgumentException("3 arguments for year month and day are required.")

        var intArgs:Seq[Int] = null

        try {
            intArgs = args.map(arg => arg.toString.toInt)
        } catch {
            case e:Exception => throw new IllegalArgumentException("Arguments must be integers")
        }

        if(!(sc.parts(0) == "" && sc.parts(3) == "" && sc.parts(1) == "-" && sc.parts(2) == "-")) throw new IllegalArgumentException("Arguments must be separated by hyphens")

        val year = intArgs(0).toInt
        val month = intArgs(1).toInt
        val day = intArgs(2).toInt

        LocalDate.of(year, month, day)
    }
}
