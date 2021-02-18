class BallFactory private constructor() {
    val balls = mutableMapOf<String, Ball>()

    fun createBall(name: String):Ball?{
        return balls[name]?.clone()
    }

    init{
        balls["big"] = Ball("BIG",250, "blue")
        balls["small"] = Ball("SMALL",100, "red")
    }

    companion object{
        private val INSTANCE: BallFactory? = null
        fun getInstance():BallFactory{
            return BallFactory()
        }
    }

}