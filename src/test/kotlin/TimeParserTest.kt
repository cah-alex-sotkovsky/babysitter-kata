import org.junit.Test
import kotlin.test.assertEquals

class TimeParserTest {

    @Test
    fun parses5PmAs24Hour() {
        assertEquals(17, parseTimeString("5:00pm"))
    }

    @Test
    fun parses6PmAs24Hour() {
        assertEquals(18, parseTimeString("6:00pm"))
    }

    @Test
    fun parsesAMAsNextDay() {
        assertEquals(27, parseTimeString("3:00am"))
    }


}