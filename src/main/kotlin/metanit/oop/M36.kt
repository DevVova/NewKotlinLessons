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
    println()

    val cube = Figure.CUBE
    cube.getName()
    println()

    val time = DayTime.DAY
    time.info()
    println(time.startHour)
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

enum class Figure(val nameI: String) {
    CUBE("Cube"), TRIANGLE("Triangle");

    fun getName() {
        println("Name is $nameI.")
    }
}

/**
 * Константы перечисления могут определять анонимные классы, которые могут иметь собственные методы и
 * свойства или реализовать абстрактные методы класса перечисления:
 */
enum class DayTime {
    DAY {
        override val startHour = 6
        override val endHour = 16

        override fun info() {
            println("It is a day.")
        }

    },
    NIGHT {
        override val startHour = 17
        override val endHour = 5

        override fun info() {
            println("It is a night.")
        }

    };
    abstract val startHour: Int
    abstract val endHour: Int
    abstract fun info()
}