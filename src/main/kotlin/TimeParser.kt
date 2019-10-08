fun parseTimeString(time: String): Int {
    val suffixBonus = if (time.endsWith("am")) {
        24
    } else {
        12
    }
    return time.first().toString().toInt() + suffixBonus
}