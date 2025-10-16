package functions

fun closure() {
    var count = 0

    val increment = {
        count ++
        println(count)
    }

    increment()
    increment()
    increment()

    println()
    val m = multiply(4)
    m(23)
}

fun multiply(n: Int): (Int) -> Int {
    return { a ->
        val rrr = a * n
        println(rrr)
        rrr
    }
}