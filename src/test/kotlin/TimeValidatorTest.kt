import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import kotlin.test.assertEquals

class TimeValidatorTest {

    @Test
    fun verifyStartTimeBefore5PMReturnsFalse(){
        val startTime = LocalDateTime.parse("01/01/2022 08:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val endTime = LocalDateTime.parse("01/01/2022 18:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val actual = verifyValidTime(startTime, endTime)
        assertEquals(false, actual)

    }

    @Test
    fun startTimeAfter5PMReturnsTrue(){
        val startTime = LocalDateTime.parse("01/01/2022 18:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val endTime = LocalDateTime.parse("01/01/2022 19:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val actual = verifyValidTime(startTime, endTime)
        assertEquals(true, actual)
    }
    @Test
    fun endTimeBefore4AMReturnsTrue(){
        val startTime = LocalDateTime.parse("01/01/2022 18:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val endTime = LocalDateTime.parse("01/02/2022 00:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val actual = verifyValidTime(startTime, endTime)
        assertEquals(true, actual)
    }

    @Test
    fun endTimeAfter4AMReturnsFalse(){
        val startTime = LocalDateTime.parse("01/01/2022 18:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val endTime = LocalDateTime.parse("01/02/2022 05:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val actual = verifyValidTime(startTime, endTime)
        assertEquals(false, actual)
    }

    @Test
    fun startTimeBeforeEndTimeReturnsTrue(){
        val startTime = LocalDateTime.parse("01/01/2022 18:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val endTime = LocalDateTime.parse("01/02/2022 01:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val actual = verifyValidTime(startTime, endTime)
        assertEquals(true, actual)
    }
    @Test
    fun startTimeAfterEndTimeReturnsFalse(){
        val startTime = LocalDateTime.parse("01/02/2022 18:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val endTime = LocalDateTime.parse("01/01/2022 01:00", DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"))
        val actual = verifyValidTime(startTime, endTime)
        assertEquals(false, actual)
    }

}
