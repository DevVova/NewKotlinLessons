package metanit.oop

/**
 * Интерфейсы представляют контракт - набор функциональности, который должен
 * реализовать класс. Интерфейсы могут содержать объявления свойств и функций,
 * а также могут содержать их реализацию по умолчанию. Интерфейсы позволяют
 * реализовать в программе концепцию полиморфизма и решить проблему множественного
 * наследования, поскольку класс может унаследовать только один класс, зато
 * интерфейсов он может реализовать множество.
 */
fun main() {
    val gena = AnyHuman("Gena")
    gena.info()
    println()
    aboutInfo(gena)
    println()
    val vova = AnyHuman2("Vova")
    aboutInfo(vova)
}

fun aboutInfo(obj: Worker) {
    obj.info()
}

interface Student {
    val name: String
    fun info() {
        println("I'm learning.")
    }
}

interface Worker {
    val name: String
    fun info() {
        println("I'm working.")
    }
}

class AnyHuman(nameI: String) : Student, Worker {
    override val name = nameI
    override fun info() {
        super<Worker>.info()
        super<Student>.info()
    }
}

class AnyHuman2(override val name: String) : Worker {
    override fun info() {
        println("I'm working.")
    }
}