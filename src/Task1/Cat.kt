open class Cat(override val runSpeed: Double, override val swimSpeed: Double) : Pet(), Runnable, Swimmable {
    override fun run() {
        println("I am a Cat, and I'm running")
    }

    override fun swim() {
        println("I am a Cat, and I'm swimming")
    }

    override val totalSpeed: Double
        get() = runSpeed + swimSpeed
}