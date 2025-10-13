package functions

fun anyFun(a: Int, b: Double, c: String = "Hello", d: IntArray) {
    println("a = $a, b = $b, c = $c, d = ${d[0]}.")
}

fun changeArray(arr: IntArray): IntArray {
    val newArray = IntArray(arr.size) { 0 }

    var ii = 0
    for (i in arr) {
        newArray[ii] = i * 2
        ii++
    }

    return newArray
}

fun manyParams(vararg numbers: Int, sayHello: String): Int {
    println(sayHello)
    var sum = 0

    for (i in numbers) {
        sum += i
    }

    return sum
}

fun ageIsValid(age: Int): Boolean {
    return age in 1..140
}

fun <T> mP(vararg n: T, s: String = "Hello") {
    if (n.isNotEmpty() && n[0] is Int) {
        for (i in n) {
            print("$i ")
        }
    }
    println("\n$s.")
}