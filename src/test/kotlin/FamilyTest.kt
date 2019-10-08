import org.junit.Test
import kotlin.test.assertEquals

class FamilyTest {

    @Test
    fun familyPaysFlatRate(){
        val family = Family(9)
        assertEquals(9, family.getPay(17))
    }

    @Test
    fun familyPaysFlatRateIfNoRuleApplies(){
        val family = Family(10)
        assertEquals(10, family.getPay(10))
    }

    @Test
    fun familyPaysPriceBeforeRuleHour(){
        val rules = mutableMapOf<Int, Int>()
        rules[17] = 5
        val family = Family(10, rules)
        assertEquals(5, family.getPay(16))
    }

}