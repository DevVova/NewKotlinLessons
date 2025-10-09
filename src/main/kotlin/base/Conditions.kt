package base

fun conditions() {
    val a = 4
    val b = 7
    println(a != 5)

    val c = if (a > b) {
        println("a > b\n")
        a
    } else if (a == b) a
    else {
        println("a < b\n")
        b
    }
    println("c = $c")

    val isEnabled = true
    when (isEnabled) {
        true -> println("It is enabled.")
        false -> println("It's disabled.")
    }

    val k = when (c) {
        10 -> {
            println("k = 10")
            c
        }

        3, 5, 8 -> 99
        in 1..7 -> 999
        a + b -> a + b
        else -> 5
    }
    println("k = $k")

    println(numberOfDigits(3))
}

fun numberOfDigits(num: Int): Int {
    return when(num) {
        in 0..9 -> 1
        in 10..99 -> 2
        else -> 3
    }
}