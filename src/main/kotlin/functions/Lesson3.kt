package functions

fun lesson3() {
    println(operation(2, 5, ::sum2))
    println(operation(45, 7) { a: Int, b: Int -> a / b })

    val selected = selectAction(222)
    println(selected(3409, 45))

    val anyFun = fun(a: Int, b: Int): Int {
        println("This is anyFun. ${ a / b }")
        return a / b
    }
    anyFun(119199, 3)

    val pr = fun(a: String): Unit = println(a)
    pr("Hello my friend.")

    println(operation(7, 47, fun(a: Int, b: Int): Int = a * b))
    println(operation(77, 3, fun(x: Int, y: Int): Int = x / y))
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun operation(a: Int, b: Int, f: (Int, Int) -> Int): Int {
    return f(a, b)
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun selectAction(key: Int): (Int, Int) -> Int {
    return when (key) {
        1 -> ::sum
        2 -> ::multiply
        3 -> fun(a: Int, b: Int): Int = a - b
        else -> fun(a: Int, b: Int): Int = a / b
    }
}