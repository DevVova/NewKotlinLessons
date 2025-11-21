package metanit.base

/**
 * В этом разделе описываются функции для ввода и вывода
 * информации в строковом виде на консоль.
 * @param println это функция вывода на консоль с переводом строки,
 * ей не обязательно иметь входные параметры.
 * @param print это функция вывода на консоль, требующая ввода.
 * @param readln это функция ввода с консоли.
 */
fun main() {
    println("Hello people!")
    println()
    print("Enter your name:\t")
    val name = readln()
    println("Hello $name!")
}