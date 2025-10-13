import functions.ageIsValid
import functions.anyFun
import functions.changeArray
import functions.mP
import functions.manyParams

fun main() {
    val arr = intArrayOf(23, 2, 2)
    anyFun(2, 3.3, d = arr)

    val newArr = changeArray(arr)
    anyFun(b = 2.0, a = 4, d = newArr)

    println(manyParams(45, 23, 12, 67, sayHello = "Hi!"))
    println(manyParams(*arr, sayHello = "Hello!"))

    println(ageIsValid(34))

    val arr2 = arrayOf(23, 34, 4)
    mP(*arr2, s = "Hello Vova!")
}