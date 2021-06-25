package kt.test

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


fun main() {

    //Expiry date : 2021-07-01 11:55:47.000Z
    //current date : 2021-06-25 14:34:12

    val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
    val date = Date()
    println(formatter.format(date))

    val filterData = "2021-07-01 11:55:47.000Z".split(" ")[0]
    val date2 = SimpleDateFormat("yyyy-MM-dd").parse(filterData)

//    val date1 = SimpleDateFormat("dd/MM/yyyy").parse("01/06/2021")
//    val date2 = SimpleDateFormat("dd/MM/yyyy").parse("01/07/2021")
    printDifference(date,date2)
}

@kotlin.jvm.Throws(ParseException::class)
private fun modifyDateLayout(inputDate: String): String? {
    val date = SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(inputDate)
    return SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(date)
}
fun printDifference(startDate: Date, endDate: Date) {
    //milliseconds
    var different = endDate.time - startDate.time
    println("startDate : $startDate")
    println("endDate : $endDate")
    println("different : $different")
    val secondsInMilli: Long = 1000
    val minutesInMilli = secondsInMilli * 60
    val hoursInMilli = minutesInMilli * 60
    val daysInMilli = hoursInMilli * 24
    val elapsedDays = different / daysInMilli
    different %= daysInMilli
    val elapsedHours = different / hoursInMilli
    different %= hoursInMilli
    val elapsedMinutes = different / minutesInMilli
    different %= minutesInMilli
    val elapsedSeconds = different / secondsInMilli
    System.out.printf(
        "%d days, %d hours, %d minutes, %d seconds%n",
        elapsedDays, elapsedHours, elapsedMinutes, elapsedSeconds
    )
}