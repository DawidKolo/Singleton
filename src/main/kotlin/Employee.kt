class Employee (val name: String, val surname: String) {


    fun addLogin(loginText: String) {
        val messageLog = MessageLog(loginText, toString())
        val companyLogs = CompanyLogs.getInstance()

        companyLogs.addMessageLog(messageLog)

    }

    override fun toString(): String {
        return "Employee('$name', '$surname')"
    }


}
