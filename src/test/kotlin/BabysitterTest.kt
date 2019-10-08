import org.junit.Test
import kotlin.test.assertFailsWith

class BabysitterTest {

    @Test
    fun cannotStartBefore5PM() {
        assertFailsWith(IllegalArgumentException::class) { calculatePay("4:00pm", "6:00pm", Family()) }
    }
}