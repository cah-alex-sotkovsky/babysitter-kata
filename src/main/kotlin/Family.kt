class Family(private val baseRate: Int = 0, rules: Map<Int, Int> = mapOf()) {
    private val rules = rules.toSortedMap()

    fun getPay(hour: Int): Int {
        if (rules.isNotEmpty()){
            val rule = rules.keys.first()
            return rules[rule] ?: baseRate
        }
        return baseRate
    }
}