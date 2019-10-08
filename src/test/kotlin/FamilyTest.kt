import org.junit.Test
import kotlin.test.assertEquals

class FamilyTest {

    @Test
    fun familyPaysFlatRate(){
        val family = Family(9)
        assertEquals(9, family.getPay(17))
    }

    @Test
    fun familyPaysFlatRateRegardlessOfHour(){
        val family = Family(10)
        assertEquals(10, family.getPay(10))
    }

}