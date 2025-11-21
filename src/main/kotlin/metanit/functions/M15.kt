package metanit.functions

/**
 * Функция может принимать переменное количество параметров одного типа.
 * Для определения таких параметров применяется ключевое слово vararg.
 */
fun main() {
    printStrings(hello = "Hi","I'm", "Vova", "!")
    val arr: IntArray = intArrayOf(24, 88, 4, 33)
    /*
    Оператор * (spread operator) (не стоит путать со знаком умножения)
    позволяет передать параметру в качестве значения элементы из массива:
     */
    println(sum(*arr))
}

fun printStrings(hello: String = "Hello", vararg strings: String) {
    print("$hello! ")
    for (i in strings) {
        print("$i ")
    }
    println()
}

fun sum(vararg a: Int): Int {
    var res = 0
    for (i in a) {
        res += i
    }
    return res
}