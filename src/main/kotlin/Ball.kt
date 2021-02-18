interface BallPrototype {
    fun clone(): BallPrototype
    fun info(): String
}

class Ball(val size: String, var maxRadius: Int, val color: String) : BallPrototype {
    override fun clone(): Ball {
        return Ball(size, maxRadius, color)
    }

    override fun info(): String {
        return "Ball: $size max radius: $maxRadius  color: $color"
    }
}