package base

fun loops() {
    for (i in 1..10) {
        for (y in 1..10) {
            print("${i * y}\t")
        }
        println()
    }
    println()

    var i = 0
    while (i < 15) {
        if (i == 3) {
            i++
            continue
        }
        if (i > 8) break
        print("$i  ")
        i++
    }
    println()

    i = 10
    do {
        print("$i   ")
        i--
    } while (i > 5)
    println()

    outlook@for (x in 1..7) {
        for (y in 1..7) {
            print("$x ")
            if (y == 5) break@outlook
        }
    }

    println()
    for (z in 7 downTo 2) {
        if (z > 2) print("$z ")
        else break
    }
    println("\n")

    for (a in 23 downTo 3 step 4) {
        print("$a ")
    }
    println()

    val range = 4 until 8
    for (z in range) {
        print("$z ")
    }
    println()

    for (z in 15 downTo 1) {
        if (z !in range) print("$z ")
    }
    println("\n")

    val range2 = 'z' downTo 'a'
    for (z in range2) {
        print("$z   ")
    }
}