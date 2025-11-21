package metanit.functions

/**
 * Функция может возвращать некоторый результат. В этом случае после списка
 * параметров через двоеточие указывается возвращаемый тип. А в теле функции
 * применяется оператор return, после которого указывается возвращаемое значение.
 */
fun main() {
    var ii = 0
    val arr1 = Array(8){ii++}
    printNewArrayToFive(arr1)
    printNewArray(arr1)
}

//Если функция возвращает значение Unit, мы также можем использовать оператор return для возврата из функции:
fun printNewArrayToFive(a: Array<Int>) {
    for (i in a) {
        if (i == 5) {
            println()
            break
        }
        print("$i  ")
    }
}

fun printNewArray(arr: Array<Int>): Array<Int> {
    for (i in arr.indices) {
        arr[i] = arr[i] * 3
        print("${arr[i]}    ")
    }
    println()
    return arr
}