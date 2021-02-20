import kotlin.random.Random

interface Engine {
    val engineSize: Double
    fun engineStart(): String
    fun engineStop(): String
}
 class diesel(override val engineSize: Double) : Engine {
    override fun engineStart(): String {
        return "engine working"
    }

    override fun engineStop(): String {
        return "engine stopped"
    }
}

open class Car(drive: diesel) : Engine by drive{
    fun Engine() {
        println(engineStart())
        println(engineStop())
    }
    fun info() {
        println("engine size $engineSize")

    }


}
fun main() {
    val simpleCar = Car(diesel(1149.0))
    simpleCar.engineStart()
    simpleCar.info()





    val employeeOne = Employee("Dawid", "Kolodziej")
    employeeOne.addLogin("Last login")

    val employeeTwo = Employee("Szymon", "Szczupacki")
    employeeTwo.addLogin("Last login")

    val employeeThree = Employee("Franciszek", "Nowak")
    employeeThree.addLogin("First login")

    val messageLogs = CompanyLogs.getInstance()
    messageLogs.printAll()


    println("*********************************************************")
    println("****************  Report  *******************************")
    println("*********************************************************")

    val ballFactory = BallFactory.getInstance()


    val balls = mutableListOf<Ball?>()


    for (i in 1..3) {
        val ball = ballFactory.createBall("big")
        ball?.maxRadius = Random.nextInt(180,199)
        balls.add(ball)
    }

    for (i in 1..7) {
        val ball = ballFactory.createBall("small")
        ball?.maxRadius = Random.nextInt(100,160)
        balls.add(ball)
    }

    balls.forEach { println(it?.info()) }

    val sawFactory = SawFactory.getInstance()



    val saws = mutableListOf<Saw?>()


    for (i in 1..4) {
        val saw = sawFactory.createSaw("cut wood")
        saw?.maxLength = Random.nextInt(145,167)
        saws.add(saw)
    }

    for (i in 1..6) {
        val saw = sawFactory.createSaw("cut metal")
        saw?.maxLength = Random.nextInt(132,144)
        saws.add(saw)
    }

    saws.forEach {println(it?.info_saw())}

    println("******************  END OF REPORT  **********************")

}