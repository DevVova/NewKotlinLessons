package metanit.oop

/**
 * Наследование позволяет создавать классы, которые расширяют функциональность
 * или изменяют поведение уже существующих классов.
 */
fun main() {
    val sasha = NewPerson2("Sasha", 65, "Kazakhstan.")
    sasha.printCountry()
    val petya = NewPerson("Petya", 23)
    petya.printName()
}

class NewPerson: Person1 {
    constructor(newName: String, newAge: Int) : super(name = newName, ageInput = newAge)

    fun printName() {
        println("He is $name.")
    }
}

class NewPerson2(name: String, age: Int, country: String): Person1(name = name, ageI = age, countryI = country) {
    fun printCountry() {
        println("He's from $country.")
    }
}
