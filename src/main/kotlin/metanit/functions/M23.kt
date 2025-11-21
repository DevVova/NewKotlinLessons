package metanit.functions

/**
 * Лямбда-выражения представляют небольшие кусочки кода, которые выполняют
 * некоторые действия. Фактически лямбды представляют сокращенную запись
 * функций. При этом лямбды, как и обычные и анонимные функции, могут
 * передаваться в качестве значений переменным и параметрам функции.
 */
fun main() {
    val s = { a: Int, b: Int -> a + b }
    println(s(44, 44))

    val s2 = { a: Int, b: Int ->
        val res = a + b
        println(res)
        res
    }
    val rrr = s2(495, 334)
    println(rrr)

    val k = doOp(34, 4) { a: Int, b: Int -> a * b }
    println(k)

    /*
    При передаче лямбды параметру или переменной, для которой
    явным образом указан тип, мы можем опустить в лямбда-выражении типы параметров:
     */
    val kk = doOp(24, 78) { a, b -> a * 4 - b }
    println(kk)

    val t = select(4)
    println(t(779, 2))
    val t2 = select(6)
    println(t2(779, 2))
}

fun doOp(a: Int, b: Int, f: (Int, Int) -> Int): Int {
    return f(a, b)
}

fun select(key: Int): (Int, Int) -> Int {
    return when (key) {
        1 -> { a, b -> a + b}
        2 -> { a, b -> a - b}
        3 -> { a, b -> a * b}
        4 -> { a, b -> a / b}
        else -> { _, _ -> 0}
    }
}