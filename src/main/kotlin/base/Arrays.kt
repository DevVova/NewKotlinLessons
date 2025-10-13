package base

fun arrays() {
    val arr: Array<Int> = Array(4) { 2 }
    for (i in arr) {
        print("$i ")
    }
    println()

    val arr2 = arrayOf(5, 34, 23)
    for (i in arr2) {
        print("$i  ")
    }
    println()

    val arr3 = arrayOfNulls<Double>(5)
    for (i in arr3) {
        print("$i\t")
    }
    println()

    var i = 3
    val arr4 = Array(5) { ++i * 2 }
    for (y in arr4) {
        print("$y ")
    }

    println("\n${arr2[arr2.size - 1]}\n")

    val people: Array<String> = arrayOf("Helen", "Coin", "Sam", "Vova", "Gena")
    print("The array include ${people.size} humans. ")
    for (person in people) {
        print(" $person")
        if (person == people[people.size - 1]) println(".")
        else print(",")
    }

    val intNumbers = intArrayOf(3, 22, 1, 223)
    println(intNumbers[0])

    val doubleNum: DoubleArray = DoubleArray(7) { 3.14 }
    for (y in doubleNum) {
        print("$y\t")
    }
    println()

    val alphabet = 'a'..'z'
    var indexForAlphabet = 0
    val ch = CharArray(26) {alphabet.elementAt(indexForAlphabet++)}
    println(ch[25])

    var index1 = 0.0
    val dd = DoubleArray(5) {
        index1 += 0.3
        index1
    }
    for (y in dd) {
        print("$y    ")
    }
}