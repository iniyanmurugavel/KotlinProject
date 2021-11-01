package kt.zresearch

import java.util.*
import java.util.concurrent.TimeUnit

fun main() {

//    val dec = DecimalFormat("#,###.0")
//    dec.roundingMode = RoundingMode.CEILING
//    val output = dec.format(80)
//    val data = String.format("%s %s", "₹",output)
//    println("output $data")


    val currentDate = Date()
    val epochCurrent = currentDate.time / 1000
    println("Epoch: $epochCurrent")


    val epochString = "1630673132104"
    val epoch = epochString.toLong()
    println("Convert Epoch $epoch to date: ")
    val d = Date(1632840959646) //convert epoch seconds to microseconds
    val timerOne  = d
    println(d)

    //You could start with a long number epoch

    //You could start with a long number epoch
    val epoch2: Long = 1632841259646
    val timerTwo = Date(epoch2)
    println(Date(epoch2))


    val startDate = Calendar.getInstance()
    startDate.time = timerOne

    val endDate = Calendar.getInstance()
    endDate.time = timerTwo

    val ageInMillis = (endDate.timeInMillis - startDate.timeInMillis)

    println("print ageInMillis $ageInMillis")

    val checkDate = Date(ageInMillis)
    println("print ageInMillis : checkDate ${checkDate.time}")
    println("print endDate  ${endDate.time}")
    val minutes = TimeUnit.SECONDS.toMinutes(ageInMillis)


    // Todo
    val currentTimestamp = System.currentTimeMillis()
    println("Current epoch timestamp in millis: $currentTimestamp")


   val addFiveMinEndTime = Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5))
   // val addFiveMinEndTime = Date(1632850570376)

    if(Date(currentTimestamp).before(addFiveMinEndTime) && !(Date(currentTimestamp).after(addFiveMinEndTime))
    ) {
        val temp1 = Calendar.getInstance()
        temp1.time = addFiveMinEndTime
        val temp2 = Calendar.getInstance()
        temp2.time = Date(currentTimestamp)
         println(" find max millis "+ temp1.timeInMillis)
        val result = ( temp1.timeInMillis - temp2.timeInMillis) / 1000
        println("check result $result")

    } else {
        println("In valid will not work ")
    }

//            val startDate = Calendar.getInstance()
//            startDate.time = Date(invoice.startTime)
//
//            val endDate = Calendar.getInstance()
//            endDate.time = Date(invoice.endTime)
//
//            val differenceInSeconds = (endDate.timeInMillis - startDate.timeInMillis)
//            Log.e("tag","==> timer Difference ==> differenceInSeconds " + differenceInSeconds)
//            reverseTimer(_seconds = differenceInSeconds, maxTime =  300000 / 1000)

    if (268 >= 269) {
        println("success")
    } else {
        println("failure")
    }
}


