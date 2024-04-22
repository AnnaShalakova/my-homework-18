package Task1

import Lion
import Salmon
import Swimmable
import Tiger
import Tuna
import java.util.*

class PetQueue {
    private val queue: Queue<Swimmable> = LinkedList()

    fun offer(pet: Swimmable) {
        queue.offer(pet)
    }

    fun poll(): Swimmable? {
        return queue.poll()
    }

    fun size(): Int {
        return queue.size
    }
}

fun main() {

    val tiger = Tiger(10.0, 5.0)
    val salmon = Salmon(12.0)
    val lion = Lion(10.0, 5.0)
    val tuna = Tuna(12.0)
    println(tiger.totalSpeed)
    println(salmon.totalSpeed)
    println(lion.totalSpeed)
    println(tuna.totalSpeed)

    val petQueue = PetQueue()

    petQueue.offer(tiger)
    petQueue.offer(salmon)
    petQueue.offer(lion)
    petQueue.offer(tuna)


    repeat(petQueue.size()) {
        val pet = petQueue.poll()
        pet?.swim()
    }
}
