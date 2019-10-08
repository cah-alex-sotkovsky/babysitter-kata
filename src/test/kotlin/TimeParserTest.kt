import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

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
    fun parses10PmAs24Hour() {
        assertEquals(22, parseTimeString("10:00pm"))
    }

    @Test
    fun parsesAMAsNextDay() {
        assertEquals(27, parseTimeString("3:00am"))
    }

    @Test
    fun timeMustHaveASuffix() {
        assertFailsWith(IllegalArgumentException::class) { parseTimeString("3:00") }
    }

    @Test
    fun timeSuffixCanBeUpperCase() {
        assertEquals(17, parseTimeString("5:00PM"))
    }

    @Test
    fun timeMustStandardFormat() {
        assertFailsWith(IllegalArgumentException::class) { parseTimeString("300pm") }
    }


}