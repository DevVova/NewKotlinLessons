package metanit

/**
 * Для хранения набора значений в Kotlin, как и в других языках программирования,
 * можно использовать массивы. При этом массив может хранить данные только одного
 * того же типа. В Kotlin массивы представлены типом Array.
 */
fun main() {
    val arr: Array<String?> = arrayOfNulls(4)
    arr.forEach { print("$it  ") }
    println()

    val numbers = Array(3){5}
    numbers.forEach { print("$it  ") }
    println()

    var x = 1
    val num = Array(5) { x++ * 5}
    num.forEach { print("$it  ") }
    println()

    val arr2 = arrayOf(24, 56, 3, 22, 95)
    println(arr2.size)
    println(arr2[arr2.size - 1])//Напечатаем последний элемент массива.

    //Проверка наличия элемента в массиве.
    println("${4 in arr2}")

    //Для упрощения создания массива в Kotlin определены дополнительные типы
    // BooleanArray, ByteArray, ShortArray, IntArray, LongArray, CharArray,
    // FloatArray и DoubleArray, которые позволяют создавать массивы для определенных типов.
    val arr3 = intArrayOf(23, 24, 5)
    println(arr3::class.qualifiedName)//Вот так можно узнать тип массива.
}