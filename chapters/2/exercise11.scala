/**
Define a string interpolator date so you can define a Java.time.LocalDate as date"$year-$month-$day"
*/


import java.time.LocalDate;

implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
        if(args.length != 3) throw new IllegalArgumentException("Arguments for year, month and day are required.")

        var intArgs:Seq[Int] = null

        try {
            intArgs = args.map(arg => arg.toString.toInt)
        } catch {
            case e:Exception => throw new IllegalArgumentException("Arguments must be integers.")
        }

        if(!(sc.parts.head == "" && sc.parts.last == "" && sc.parts(1) == "-" && sc.parts(2) == "-")) throw new IllegalArgumentException("Format year-month-day required.")

        val year = intArgs(0)
        val month = intArgs(1)
        val day = intArgs(2)

        LocalDate.of(year, month, day)
    }
}
