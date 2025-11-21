package metanit.functions

/**
 * Функции высокого порядка (high order function) - это функции, которые либо
 * принимают функцию в качестве параметра, либо возвращают функцию, либо и то, и другое.
 */
fun main() {
    var res = action(35, 33, ::subtract2)
    println(res)
    res = action(35, 33, ::multiply)
    println(res)

    val actionThis = selectAction(4)
    println(actionThis(55, 3))
}

fun action(a: Int, b: Int, f: (Int, Int) -> Int): Int {
    return f(a, b)
}

fun subtract2(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun selectAction(key: Int): (Int, Int) -> Int {
    return when(key) {
        1 -> ::subtract2
        else -> ::multiply
    }
}