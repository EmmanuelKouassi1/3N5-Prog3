import org.magicwerk.brownies.collections.GapList
import java.util.*
import kotlin.collections.ArrayList
import kotlin.system.measureTimeMillis

fun testeCetteListe(liste: MutableList<Int>) {
    val random = Random(1234)


    val timeLast = measureTimeMillis {
        repeat(100_000) { i ->
            liste.add(i)
        }
    }


    val timeFirst = measureTimeMillis {
        repeat(100_000) { i ->
            liste.add(0, i)
        }
    }


    val timeRandom = measureTimeMillis {
        repeat(100_000) { i ->
            liste.add(random.nextInt(liste.size + 1), i)
        }
    }

    println("Temps d'ajout en dernière position : $timeLast ms")
    println("Temps d'ajout en première position : $timeFirst ms")
    println("Temps d'ajout à une position au hasard : $timeRandom ms")
}

fun main() {
    println("Test pour LinkedList:")
    testeCetteListe(LinkedList())

    println("\nTest pour ArrayList:")
    testeCetteListe(ArrayList())
    val list: GapList<String> = GapList()
    println("\nTest pour GapList: $list")

}