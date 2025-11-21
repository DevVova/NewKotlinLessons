package metanit.base

/**
 * Условные конструкции позволяют направить выполнение программы по одному из путей в зависимости от условия.
 */
fun main() {
    val a = 7
    val b = 9
    val c = a * 3
    if (a == b) {
        println("a = b")
    } else if (a < b) println("a < b")
    else println("a > b")

    //Стоит отметить, что конструкция if может возвращать значение.
    val d = if (c == b) {
        println("c = b")
        a
    } else if (c < b) {
        println("c < b")
        b
    } else {
        println("c > b")
        c
    }
    println("d = $d.")
}