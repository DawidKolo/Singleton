import java.util.*

class MessageLog(val text: String, val author: String, val date: Date = Date()){
    override fun toString(): String {
        return "messageLog(text='$text', '$author', $date)"
    }
}