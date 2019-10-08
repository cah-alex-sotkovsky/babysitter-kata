class Family(private val baseRate: Int = 0, hourToPay: Map<Int, Int> = mapOf()) {
    private val rules = hourToPay.toSortedMap()

    fun getPay(hour: Int): Int {
        val ruleHour = rules.keys.firstOrNull { hour < it }
        return if (ruleHour != null) {
            rules[ruleHour] ?: baseRate
        } else {
            baseRate
        }
    }
}