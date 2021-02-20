import java.time.DayOfWeek

class MessageLog(val text: String, val employeeMessage: String, val dayOfWeek: DayOfWeek = DayOfWeek.MONDAY){
    override fun toString(): String {
        return "messageLog(text='$text', '$employeeMessage', $dayOfWeek)"
    }
}