open class Fish(override val swimSpeed: Double) : Pet(), Swimmable {
    override fun swim() {
        println("I am a Fish, and I'm swimming")
    }

    override val totalSpeed: Double
        get() = swimSpeed
}