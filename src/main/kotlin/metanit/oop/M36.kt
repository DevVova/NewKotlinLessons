package metanit.oop

/**
 * Enums или перечисления представляют тип данных, который позволяет определить
 * набор логически связанных констант. Для определения перечисления применяются
 * ключевые слова enum class.
 */
fun main() {
    var myOrder = OrderType.BUY
    selectAction(myOrder)
    myOrder = OrderType.SELL
    selectAction(myOrder)

    println(selectActionWithTrend(TrendDirection.FLOAT))
    println(TrendDirection.DOWN.value)
    var t = TrendDirection.UP
    t.printValue()
    println(t.name)//name: возвращает название константы в виде строки.
    t = TrendDirection.FLOAT
    println(t.ordinal)//ordinal: возвращает порядковый номер константы.

    //entries возвращает массив констант текущего перечисления
    for (i in TrendDirection.entries) {
        println(i)
    }

    //valueOf(value: String): возвращает объект перечисления по названию константы
    val whereTrend = TrendDirection.valueOf("DOWN")
    println(whereTrend.name)
    whereTrend.printValue()
}

/**
 * При этом перечисления - это не просто список значений. Они могут определять
 * также свойства и функции. Но если класс перечисления содержит свойства или
 * функции, то константы должны быть отделены точкой с запятой.
 */
enum class TrendDirection(val value: Int) {
    UP(1), DOWN(2), FLOAT(3);

    fun printValue() {
        println("Value = $value.")
    }
}

enum class OrderType {
    BUY, SELL
}

fun selectAction(order: OrderType) {
    if (order == OrderType.BUY) println("Buy now.")
    else println("Sell now.")
}

fun selectActionWithTrend(trend: TrendDirection): String {
    return when(trend) {
        TrendDirection.FLOAT -> "Nothing!"
        TrendDirection.UP -> "Buy"
        TrendDirection.DOWN -> "Sell"
    }
}