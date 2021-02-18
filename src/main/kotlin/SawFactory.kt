class SawFactory private constructor() {
    val saws = mutableMapOf<String, Saw>()

    fun createSaw(name: String):Saw?{
        return saws[name]?.clone_saw()
    }

    init{
        saws["cut metal"] = Saw("cut metal",555, "plastic")
        saws["cut wood"] = Saw("cut wood",333, "carbon steel")
    }

    companion object{
        private val INSTANCE: SawFactory? = null
        fun getInstance():SawFactory{
            return SawFactory()
        }
    }

}