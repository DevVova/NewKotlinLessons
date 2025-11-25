package metanit.oop

/**
 * Для создания объекта необходимо вызвать конструктор класса.
 * По умолчанию компилятор создает конструктор, который не принимает
 * параметров и который мы можем использовать. Но также мы можем
 * определять свои собственные конструкторы. Классы в Kotlin могут
 * иметь один первичный конструктор (primary constructor) и один или
 * несколько вторичных конструкторов (secondary constructor).
 */
fun main() {
    val gena = Person1("Gena", 15, "Kazakhstan")
    gena.info()
    println(gena.name)
}

open class Person1(val name: String, ageInput: Int) {
    open var country = "USA"
    var age: Int = 1

    init{
        if (ageInput in 1..140) age = ageInput
    }

    constructor(name: String, ageI: Int, countryI: String) : this(name, ageI) {
        country = countryI
    }

    open fun info() {
        println("Hello! I'm $name. I'm $age years old. I am from $country.")
    }
}