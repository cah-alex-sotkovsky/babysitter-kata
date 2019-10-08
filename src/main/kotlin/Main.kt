import java.lang.IllegalArgumentException

private const val minStartHour = 17
private const val maxEndHour = 28

fun calculatePay(startTime: String, endTime: String, family: Family) {
    val startHour = parseTimeString(startTime)
    val endHour = parseTimeString(endTime)
    if (startHour < minStartHour){
        throw IllegalArgumentException("$startTime is before the minimum start hour")
    }
    if (endHour > maxEndHour){
        throw IllegalArgumentException("$endTime is after the minimum start hour")
    }
    println("hello world")
}