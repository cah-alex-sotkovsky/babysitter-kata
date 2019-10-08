fun parseTimeString(time: String): Int {
    val suffixBonus = if (time.endsWith("am")) {
        24
    } else {
        12
    }
    val hour = time.split(":").first().toInt()
    return hour + suffixBonus
}