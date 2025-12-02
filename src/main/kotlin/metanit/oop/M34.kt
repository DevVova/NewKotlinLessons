package metanit.oop

/**
 * В Kotlin одни классы могут быть определены в других классах. Такие классы
 * называют вложенными классами или nested classes. Они обычно выполняют
 * какую-то вспомогательную роль, а определение их внутри класса или интерфейса
 * позволяет разместить их как можно ближе к тому месту, где они непосредственно используются.
 * Однако мы не можем обратиться к свойствам и функциям внешнего класса.
 *
 * Чтобы вложенный класс мог иметь доступ к свойствам и функциям внешнего класса,
 * необходимо определить вложенный класс с ключевым словом inner. Такой класс еще
 * называют внутренним классом (inner class), чтобы отличать от обычных вложенных классов.
 */
fun main() {
    val vova = Persons.Account("Vova", "23493o")
    vova.info()
    vova.nameInfo()

    val gena = Persons2("Gena", "3jrjdki")
    gena.info()

    Persons3("Fedya", "Etruria").Account3("4748349j").info()
}

//Здесь также на примере вложенный интерфейс.
class Persons {
    interface NameInfo {
        fun nameInfo()
    }

    class Account(val userName: String, val password: String): NameInfo {
        fun info() {
            println("Username - $userName, password - $password.")
        }

        override fun nameInfo() {
            println("Name is $userName.")
        }
    }
}

//Ниже пример использования вложенного класса с ограниченным доступом.
class Persons2(userName: String, password: String) {
    private val userData: Account2 = Account2(userName, password)

    private class Account2(val userName: String, val password: String)

    fun info() {
        println("Username: ${userData.userName}. Password: ${userData.password}.")
    }
}

//Ниже пример использования внутреннего класса. А также обращение к свойству при совпадении названий.
class Persons3(userName: String, password: String) {
    val u = userName
    val p = password

    inner class Account3(val p: String) {
        fun info() {
            println("Name - $u. Password = ${this@Account3.p}. The old password is ${this@Persons3.p}.")
        }
    }
}