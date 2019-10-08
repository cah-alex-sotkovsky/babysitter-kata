private val timeFormat = Regex("\\d{1,2}:\\d\\d[ap]m")

fun parseTimeString(time: String): Int {
    val lowerCaseTime = time.toLowerCase()
    ensureValidTime(lowerCaseTime)
    val suffixBonus = if (lowerCaseTime.endsWith("am")) {
        24
    } else {
        12
    }
    val hour = lowerCaseTime.split(":").first().toInt()
    return hour + suffixBonus
}

private fun ensureValidTime(time: String) {
    if (!time.endsWith("am") && !time.endsWith("pm")) {
        throw IllegalArgumentException("Time $time must end with either AM or PM")
    }
    if (!timeFormat.matches(time)){
        throw IllegalArgumentException("Time $time must follow standard format. EG 5:00pm")
    }
}