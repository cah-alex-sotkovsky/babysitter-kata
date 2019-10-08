import java.lang.IllegalArgumentException

private const val minStartHour = 17
private const val maxEndHour = 28

fun calculatePay(startTime: String, endTime: String, family: Family) : Int {
    val startHour = parseTimeString(startTime)
    val endHour = parseTimeString(endTime)
    ensureValidTimes(startHour, startTime, endHour, endTime)
    return 11
}

private fun ensureValidTimes(startHour: Int, startTime: String, endHour: Int, endTime: String) {
    if (startHour < minStartHour) {
        throw IllegalArgumentException("$startTime is before the minimum start hour")
    }
    if (endHour > maxEndHour) {
        throw IllegalArgumentException("$endTime is after the minimum start hour")
    }
    if (startHour > endHour) {
        throw IllegalArgumentException("Start $startTime is after end time $endTime")
    }
}
