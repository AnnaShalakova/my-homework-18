class Tiger(runSpeed: Double, swimSpeed: Double) : Cat(runSpeed, swimSpeed) {
    override fun run() {
        super.run()
        println("I am a Tiger, and I'm running")
    }

    override fun swim() {
        super.swim()
        println("I am a Tiger, and I'm swimming")
    }
}