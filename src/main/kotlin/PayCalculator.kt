import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*

private const val minStartHour = 17
private const val maxEndHour = 4


fun verifyValidStartTime(startTime: LocalTime): Boolean{
    return startTime.hour > minStartHour
}

fun verifyValidEndTime(endTime: LocalTime): Boolean{
    return endTime.hour < maxEndHour
}

//fun calculatePay(startTime: Date, endTime: Date, family: Family){


