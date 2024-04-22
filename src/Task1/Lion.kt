class Lion(runSpeed: Double, swimSpeed: Double) : Cat(runSpeed, swimSpeed) {
    override fun run() {
        super.run()
        println("I am a Lion, and I'm running")
    }

    override fun swim() {
        super.swim()
        println("I am a Lion, and I'm swimming")
    }
}