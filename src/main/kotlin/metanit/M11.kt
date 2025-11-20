package metanit

/**
 * Циклы представляют вид управляющих конструкций, которые позволяют в
 * зависимости от определенных условий выполнять некоторое действие множество раз.
 */
fun main() {
    var res: Int
    for (i in 1..9) {
        for (x in 1..9) {
            res = i * x
            print("$res\t")
        }
        println()
        if (i == 9) println()
    }

    var i = 0
    while (i < 10) {
        print("${i * i} ")
        i++
    }
    println("\n")

    var x = 5
    do {
        print("${x * 2} ")
        x++
    } while (x <= 6)
    println("\n")

    val arr = arrayOf(23, 12, 2, 56, 7, 22, 34, 35)
    for (f in arr) {
        if (f < 8) continue
        if (f == 22) break
        print("$f  ")
    }
    println("\n")

    //Пример использования метки для выхода из всех циклов. А иначе будет выход из одного
    outer@ for (k in 1..4) {
        for (m in 1..4) {
            if (m == 3) break@outer
            print("$m in $k     ")
        }
    }
}