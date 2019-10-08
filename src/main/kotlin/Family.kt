class Family(private val baseRate: Int = 0, hoursToWage: Map<Int, Int> = mapOf()) {
    private val hoursToWage = hoursToWage.toSortedMap()

    fun getPay(hour: Int): Int {
        val ruleHour = hoursToWage.keys.firstOrNull { hour < it }
        return if (ruleHour != null) {
            hoursToWage[ruleHour] ?: baseRate
        } else {
            baseRate
        }
    }

    companion object {
        fun withStringTimes(baseRate: Int, timesToPay: Map<String, Int>): Family {
            val stringTimes = timesToPay.mapKeys { parseTimeString(it.key) }
            return Family(baseRate, stringTimes)
        }
    }
}