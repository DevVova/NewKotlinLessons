package metanit.practice

fun main() {
    val res = doOperation(35, 33) {
        a, b ->
        println("${a * b}")
        a + b
    }
    println("res = $res.")
}

fun doOperation(a: Int, b: Int, f: (Int, Int) -> Int): Int {
    return f(a, b)
}