import java.time.LocalDateTime
import java.util.*

private const val minStartHour = 17
private const val maxEndHour = 28


fun verifyValidStartTime(startTime: LocalDateTime): Boolean{
    return startTime.hour > minStartHour
}

//fun fetchHour(startTime: LocalDateTime): Int{
//   return startTime.hour
//}
//fun calculatePay(startTime: Date, endTime: Date, family: Family){


