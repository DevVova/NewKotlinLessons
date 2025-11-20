package metanit

/**
 * Одним из строительных блоков программы являются функции. Функция
 * определяет некоторое действие. В Kotlin функция объявляется с помощью
 * ключевого слова fun, после которого идет название функции. Затем после
 * названия в скобках указывается список параметров. Если функция возвращает
 * какое-либо значение, то после списка параметров через двоеточие можно
 * указать тип возвращаемого значения. И далее в фигурных скобках идет тело функции.
 */
fun main() {
    println(sum(77, 13))
    info("Vova")
    info(age = 47, name = "Vladimir")
    val arr: IntArray = intArrayOf(2828, 4848, 444)
    exchangeFirstElementFromArray(arr, 3000)
    arr.forEach { print("$it  ") }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

//Необязательные параметры.
fun info(name: String, age: Int = 17, country: String = "USA") {
    println("Hello! He is $name. He's $age years old. He is from $country.")
}

//По умолчанию все параметры функции равносильны val-переменным, поэтому их значение нельзя изменить.
//Однако если параметр представляет какой-то сложный объект, то можно изменять отдельные значения в этом объекте.
fun exchangeFirstElementFromArray(arr: IntArray, newValue: Int = 0) {
    arr[0] = newValue
}