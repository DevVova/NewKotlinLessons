package metanit.oop

/**
 * Kotlin позволяет переопределять в производном классе функции и свойства,
 * которые определенны в базовом классе. Чтобы функции и свойства базового
 * класса можно было переопределить, к ним применяется аннотация open. При
 * переопределении в производном классе к этим функциям применяется аннотация override.
 */
fun main() {
    val vova = SuperPerson("Vova", 47)
    vova.info()
}

class SuperPerson(name: String, age: Int, override var country: String = "Kazakhstan") : Person1(name = name, ageI = age, countryI = country) {
    override fun info() {
        super.info()
        println("I'm super!")
    }
}