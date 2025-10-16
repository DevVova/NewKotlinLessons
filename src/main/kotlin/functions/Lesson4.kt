package functions

fun lesson4() {
    val res2 = doOperation(23, 45) { x: Int, y: Int ->
        x * y
    }
    println(res2)

    val sum3 = { a: Int, b: Int -> a + b }
    println(sum3(3, 22))

    val sum4 = { a: Int, b: Int ->
        val res = a + b
        println(res)
        res
    }

    val r = sum4(3, 44)
    println(r)

    println(doOperation(3, 77) { x: Int, y: Int -> x * y })

    println(doOperation(33, 88) { a, b -> a * b * b * b })

    val act = selectAction2(3)
    println(act(77, 77))
}

fun doOperation(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun selectAction2(key: Int): (Int, Int) -> Int {
    return when (key) {
        1 -> { a, b -> a + b }
        2 -> { a, b -> a - b }
        3 -> { a, b -> a * b }
        4 -> { a, b -> a / b }
        else -> { _, _ -> 0 }
    }
}