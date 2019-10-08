import java.lang.IllegalArgumentException

private const val minStartHour = 17

fun calculatePay(startTime: String, endTime: String, family: Family) {
    val startHour = parseTimeString(startTime)
    if (startHour < minStartHour){
        throw IllegalArgumentException("$startTime is before the minimum start hour")
    }
    println("hello world")
}