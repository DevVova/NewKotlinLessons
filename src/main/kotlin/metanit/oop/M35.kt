package metanit.oop

import kotlin.math.round

/**
 * Иногда классы бывают необходимы только для хранения некоторых данных. В Kotlin такие классы называются data-классы.
 */
fun main() {
    val lastCandle = Candle(12.9, 13.0, 12.1, 12.5, 345)
    println(lastCandle)
    println(lastCandle.volume)

    val preLastCandle = lastCandle.copy(open = lastCandle.close, volume = 45)
    println(preLastCandle)

    //Декомпозиция data-классов.
    val(o, h, l, c, v) = preLastCandle
    val range = h - l
    println(o)
    println("ATR = ${round(range)}. Close = $c, Volume = $v.")
}

data class Candle(
    val open: Double,
    val high: Double,
    val low: Double,
    val close: Double,
    val volume: Int
)