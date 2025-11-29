package metanit.oop

/**
 * Абстрактные классы - это классы, определенные с модификатором abstract.
 * Отличительной особенностью абстрактных классов является то, что мы не
 * можем создать объект подобного класса.
 */
fun main() {
    val myOrder = MyOrder2(1)
    myOrder.info()
}

abstract class Order1(valueI: Int) {
    val value: Int = if (valueI != 0) valueI
    else 1

    abstract fun info()
}

class MyOrder2(valueII: Int) : Order1(valueII) {
    override fun info() {
        println("Value = $value.")
    }
}