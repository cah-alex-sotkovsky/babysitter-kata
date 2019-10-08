import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class BabysitterTest {

    @Test
    fun cannotStartBefore5PM() {
        assertFailsWith(IllegalArgumentException::class) { calculatePay("4:00pm", "6:00pm", Family()) }
    }

    @Test
    fun cannotEndAfter4Am() {
        assertFailsWith(IllegalArgumentException::class) { calculatePay("5:00pm", "5:00am", Family()) }
    }

    @Test
    fun cannotEndBeforeTheStart() {
        assertFailsWith(IllegalArgumentException::class) { calculatePay("7:00pm", "5:00pm", Family()) }
    }

    @Test
    fun totalsFlatRateHoursMaxTime() {
        //It's only $1 per hour, but the house is a mansion with free ice cream
        assertEquals(11, calculatePay("5:00pm", "4:00am", Family(1)))
    }

    @Test
    fun totalsFlatRateHoursSmallTimePeriod() {
        assertEquals(4, calculatePay("5:00pm", "7:00pm", Family(2)))
    }

    @Test
    fun familyAFullHours() {
        val family = Family(20, mapOf(12 + 11 to 15))
        assertEquals(190, calculatePay("5:00pm", "4:00am", family))
    }

    @Test
    fun familyBFullHours() {
        val family = Family(16, mapOf(12 + 10 to 12, 24 to 8))
        assertEquals(140, calculatePay("5:00pm", "4:00am", family))
    }

    @Test
    fun familyCFullHours() {
        val family = Family(15, mapOf(12 + 9 to 21))
        assertEquals(189, calculatePay("5:00pm", "4:00am", family))
    }

}