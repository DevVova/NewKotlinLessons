package metanit.functions

/**
 * Однострочные функции (single expression function) используют сокращенный
 * синтаксис определения функции в виде одного выражения. Эта форма позволяет
 * опустить возвращаемый тип и оператор return.
 */
fun main() {
    println(sum2(45, 3))
    compareAge(35, 22)
}

fun sum2(a: Int, b: Int) = a + b

//Одни функции могут быть определены внутри других функций. Внутренние или вложенные функции еще называют локальными.
fun compareAge(age1: Int, age2: Int) {
    fun ageIsValid(age: Int) = age in 1..<140
    if (ageIsValid(age1) && ageIsValid(age2)) {
        when {
            age1 == age2 -> println("age1 = age2")
            age1 < age2 -> println("age1 < age2")
            else -> println("age1 > age2")
        }
    } else {
        if (!ageIsValid(age1)) println("Invalid age1")
        else println("Invalid age2")
    }
}