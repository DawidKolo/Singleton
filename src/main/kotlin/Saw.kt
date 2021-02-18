interface sawPrototype {
    fun clone_saw(): sawPrototype
    fun info_saw(): String
}

class Saw(val name2: String, var maxLength: Int, val handle: String) : sawPrototype {
    override fun clone_saw(): Saw {
        return Saw(name2, maxLength, handle)
    }

    override fun info_saw(): String {
        return "Saw: $name2 max Length: $maxLength Handle: $handle"
    }
}