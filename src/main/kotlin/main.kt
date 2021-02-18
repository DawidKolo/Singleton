import kotlin.random.Random

fun main() {


    val employeeOne = Employee("Dawid", "Kolodziej")
    employeeOne.addLogin("Monday login")

    val employeeTwo = Employee("Szymon", "Szczupacki")
    employeeTwo.addLogin("Tuesday login")

    val messageLogs = CompanyLogs.getInstance()
    messageLogs.printAll()


    println("*********************************************************")
    println("****************  Report  *******************************")
    println("*********************************************************")

    val ballFactory = BallFactory.getInstance()


    val balls = mutableListOf<Ball?>()


    for (i in 1..3) {
        val ball = ballFactory.createBall("big")
        ball?.maxRadius = Random.nextInt(180,400)
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
        saw?.maxLength = Random.nextInt(250,260)
        saws.add(saw)
    }

    for (i in 1..6) {
        val saw = sawFactory.createSaw("cut metal")
        saw?.maxLength = Random.nextInt(250,260)
        saws.add(saw)
    }

    saws.forEach {println(it?.info_saw())}

    println("******************  END OF REPORT  **********************")
    
}