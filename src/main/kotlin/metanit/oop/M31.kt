package metanit.oop

/**
 * Геттеры (getter) и сеттеры (setter) (еще их называют методами доступа)
 * позволяют управлять доступом к переменной.
 */
var name: String = "Gena"
    set(value) {
        field = if (value != "Vova") "Stuped"
        else value
    }
    get() {
        if (field != "Vova") println("Fuck you!")
        return field
    }
fun main() {
    name = "Sam"
    println(name)
    name = "Vova"
    println(name)

    val petya = SuperStuped("Petya")
    petya.info()
    petya.age = -345
    petya.info()
    val vova = SuperStuped("Vova")
    vova.age = 47
    vova.info()
}

open class Stuped {
    open var name = "Gena"
}

class SuperStuped(nameI: String) : Stuped() {
    var age = 54
        set(value) {
            field = if (value in 1..140) value
            else {
                println("Неверно указан возраст.")
                1
            }
        }
    override var name: String = nameI
        get() {
            field = if (field != "Vova") "Super stuped"
            else field
            return field
        }

    fun info() {
        println("Hello. I'm $name. I'm $age years old.")
    }
}