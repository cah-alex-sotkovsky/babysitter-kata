fun parseTimeString(time: String): Int {
    if (!time.endsWith("am") && !time.endsWith("pm")) {
        throw IllegalArgumentException("Time must end with either AM or PM")
    }
    val suffixBonus = if (time.endsWith("am")) {
        24
    } else {
        12
    }
    val hour = time.split(":").first().toInt()
    return hour + suffixBonus
}