import org.junit.Test
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

}