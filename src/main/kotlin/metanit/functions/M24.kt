package metanit.functions

/**
 * Замыкание (closure) представляет объект функции, который запоминает
 * свое лексическое окружение даже в том случае, когда она выполняется
 * вне своей области видимости.
 */
fun main() {
    val iterable = outer()
    iterable()
    iterable()
    iterable()

    val z = someFun(4)
    println(z(5))
    println(z(125))
    println(z(54))

    val lotForPosition = riskManagement(2, 12000)
    println(lotForPosition(120))
}

fun outer(): () -> Unit {
    var i = 0
    fun inner() {
        i++
        println(i)
    }
    return ::inner
}

fun someFun(a: Int): (Int) -> Int {
    return { m: Int -> m * a }
}

fun riskManagement(riskPercent: Int, depo: Int): (Int) -> Int {
    val riskInMoney = depo / 100 * riskPercent
    fun getLot(delta: Int): Int {
        return riskInMoney / delta
    }
    return ::getLot
}