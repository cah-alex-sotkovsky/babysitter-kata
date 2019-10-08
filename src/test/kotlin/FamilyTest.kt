import org.junit.Test
import kotlin.test.assertEquals

class FamilyTest {

    @Test
    fun familyPaysFlatRate(){
        val family = Family(9)
        assertEquals(9, family.getPay(17))
    }

}