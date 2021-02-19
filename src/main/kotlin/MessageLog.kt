import java.util.*

class MessageLog(val text: String, val employeeMessage: String, val date: Date = Date()){
    override fun toString(): String {
        return "messageLog(text='$text', '$employeeMessage', $date)"
    }
}