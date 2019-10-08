import org.junit.Test
import kotlin.test.assertEquals

class TimeParserTest {

    @Test
    fun parses5PmAs24Hour() {
        assertEquals(17, parseTimeString("5:00pm"))
    }


}