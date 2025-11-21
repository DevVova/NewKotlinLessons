package metanit.functions

/**
 * Анонимные функции выглядят как обычные за тем исключением, что они не имеют имени.
 */
fun main() {
    val res = fun(a: Int, b: Int): Int {
        println("${a + b}")
        return a + b
    }
    val rr = res(77, 8)
    println(rr)

    val r1 = doOperation(88, 9, fun(a: Int, b: Int): Int = a * b)
    println(r1)
    val anyFun = fun(a: Int, b: Int) = a - b//Это не имя функции, это переменная, содержащая функцию.
    val r2 = doOperation(99, 1, anyFun)//Поэтому не ::anyFun, а так.
    println(r2)

    val ff = selectFromAction(4)
    println(ff(39393, 33))
    val ff2 = selectFromAction(5)
    println(ff2(39393, 33))
}

fun doOperation(a: Int, b: Int, f: (Int, Int) -> Int): Int {
    return f(a, b)
}

fun selectFromAction(key: Int): (Int, Int) -> Int {
    return when (key) {
        1 -> fun(a: Int, b: Int): Int = a + b
        2 -> fun(a: Int, b: Int): Int = a - b
        3 -> fun(a: Int, b: Int): Int = a * b
        4 -> fun(a: Int, b: Int): Int = a / b
        else -> fun(_, _): Int = 0
    }
}