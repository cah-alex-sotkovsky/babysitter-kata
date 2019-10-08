class Family(private val baseRate: Int = 0, rules: Map<Int, Int> = mapOf()) {
    private val rules = rules.toSortedMap()

    fun getPay(hour: Int): Int {
        val rule = rules.keys.firstOrNull { hour < it }
        return if (rule != null) {
            rules[rule] ?: baseRate
        } else {
            baseRate
        }
    }
}