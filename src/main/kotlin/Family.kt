class Family(private val baseRate: Int = 0, private val rules: Map<Int, Int> = mapOf()) {

    fun getPay(hour: Int): Int {
        if (rules.isNotEmpty()){
            val rule = rules.keys.first()
            return rules[rule] ?: baseRate
        }
        return baseRate
    }
}