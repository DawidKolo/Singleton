class CompanyLogs private constructor(){
    val messageLogs = mutableListOf<MessageLog>()

    companion object{
        private var INSTANCE: CompanyLogs? = null

        fun getInstance(): CompanyLogs {
            if(INSTANCE==null)
                INSTANCE = CompanyLogs()

            return INSTANCE!!
        }
    }

    fun addMessageLog(messageLog: MessageLog){
        messageLogs.add(messageLog)
    }

    fun printAll(){
        messageLogs.forEach(::println)
    }

}