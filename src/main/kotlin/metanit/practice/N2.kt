package metanit.practice

fun main() {
    val audi = Audi(33000, "Grey")
    audi.info()
    audi.move()
}

interface Movable {
    fun move() {
        println("The movable is moving.")
    }
    fun printAbout()
}

abstract class Car(val price: Int) {
    abstract val color: String

    fun info() {
        println("This is a car. Its color is $color. And price is $price.")
    }
}

class Audi(priceForAudi: Int, override val color: String = "White") : Car(priceForAudi), Movable {
    override fun printAbout() {
        println("It is a movable.")
    }
}