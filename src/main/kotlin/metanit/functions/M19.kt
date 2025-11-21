package metanit.functions

/**
 * В Kotlin все является объектом, в том числе и функции. И функции, как и другие объекты, имеют определенный тип.
 */
fun main() {
    var res: (Int, Int) -> Int = ::s
    println(res(45, 3))
    val r = res(34, 23)
    println(r)
    res = ::subtract
    val f = res(2, 78)
    println(f)
}

fun s(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}