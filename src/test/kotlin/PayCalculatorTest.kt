import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import java.time.LocalTime

import java.util.*
import kotlin.test.assertEquals

class PayCalculatorTest {

    @Test
    fun verifyStartTimeBefore5PMReturnsFalse(){
        val startTime = LocalTime.parse("10:15:45")
        val actual = verifyValidStartTime(startTime)
        assertEquals(false, actual)
    }

    @Test
    fun verifyStartTimeAfter5PMReturnsTrue(){
        val startTime = LocalTime.parse("20:15:00")
        val actual = verifyValidStartTime(startTime)
        assertEquals(true, actual)
    }
    @Test
    fun verifyEndTimeBefore4AMReturnsTrue(){
        val endTime = LocalTime.parse("01:00:00")
        val actual = verifyValidEndTime(endTime)
        assertEquals(true, actual)
    }

    @Test
    fun verifyEndTimeAfter4AMReturnsFalse(){
        val endTime = LocalTime.parse("06:00:00")
        val actual = verifyValidEndTime(endTime)
        assertEquals(false, actual)
    }

}
