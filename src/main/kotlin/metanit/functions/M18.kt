package metanit.functions

/**
 * Перегрузка функций (function overloading) представляет определение нескольких
 * функций с одним и тем же именем, но с различными параметрами. Параметры
 * перегруженных функций могут отличаться по количеству, типу или по порядку
 * в списке параметров.
 * При этом при перегрузке не учитывает возвращаемый результат функции.
 */
fun main() {
    println(mySum(2.3, 4F))
    println(mySum(2, 5))
    println(mySum(2, 4, 1))
    println(mySum(2, 3e-2))
}

fun mySum(a: Int, b: Int): Int = a + b

fun mySum(a: Int, b: Int, c: Int) = a + b + c

fun mySum(a: Int, b: Double): Int = a + b.toInt()

fun mySum(a: Double, b: Float) = a.toFloat() + b