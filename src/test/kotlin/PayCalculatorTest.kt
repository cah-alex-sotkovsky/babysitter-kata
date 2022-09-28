import org.junit.jupiter.api.Test
import java.time.LocalDateTime

import java.util.*

class PayCalculatorTest {

    @Test
    fun startTimeNotBefore5PM(){
        val startTime = LocalDateTime.now()
        verifyValidStartTime(startTime)
    }

}
