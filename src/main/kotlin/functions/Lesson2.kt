package functions

fun lesson2() {
    println(sum(23, 89))

    println()
    compareAge(35, 7)
    compareAge(185, 7)
    compareAge(5, 7)
    println()

    println(sum(2, 4, 56, 3, 33))
    println(sum(23, 8.9))
    println(sum(23.44, 89))

    println()
    var newSum: (Int, Int) -> Int = ::sum
    println(newSum(2, 2))
    newSum = ::subtract
    println(newSum(3, 3))
}

fun sum(a: Int, b: Int) = a + b

fun sum(a: Int, b: Double) = a + b

fun sum(a: Double, b: Int): Int {
    return a.toInt() + b
}

fun sum(vararg a: Int): Int {
    var result = 0
    for (i in a) {
        result += i
    }
    return result
}

fun compareAge(age1: Int, age2: Int) {
    fun ageIsValid(age: Int) = age in 1..140

    if (ageIsValid(age1) && ageIsValid(age2)) {
        when {
            age1 > age2 -> println("age1 > age2")
            age1 < age2 -> println("age1 < age2")
            else -> println("age1 == age2")
        }
        return
    }

    println("Age is invalid. Wow.")
}

fun subtract(a: Int, b: Int): Int {
    return a * b
}