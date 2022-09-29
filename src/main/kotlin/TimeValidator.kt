import java.time.LocalDateTime

private const val minStartHour = 17

fun verifyValidTime(startTime: LocalDateTime, endTime: LocalDateTime): Boolean{
    val isStartTimeValid = startTime.hour > minStartHour
    val isEndTimeValid = endTime.hour in 0..4 || endTime.hour in 17..24
    val isStartTimeBeforeEndTime = startTime.isBefore(endTime)

    return isStartTimeValid && isEndTimeValid && isStartTimeBeforeEndTime
    }




