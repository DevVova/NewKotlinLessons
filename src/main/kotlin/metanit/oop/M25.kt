package metanit.oop

class Person {
    val name = "Vova"
    val age = 47

    fun info() {
        println("Hello! I'm $name. I am $age years old.")
    }
}

fun main() {
    val vova = Person()
    println(vova.name)
    vova.info()
}