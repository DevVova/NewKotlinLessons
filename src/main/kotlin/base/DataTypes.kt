package base
import java.io.OutputStreamWriter
import java.nio.charset.StandardCharsets

fun mainDataTypes() {
    var a: Byte
    val b: Short = 245
    a = 127
    val c: Int = -89
    val d = 7
    a = 23
    val e: Long = 89
    val ee = 9L
    val aa: UByte = 23U
    val bb: UShort = 8U
    val cc = 45U
    val ccc: UInt = 56U
    val dd: ULong = 48484848U
    var num = 0xFF34
    println(num)
    num = 0b00110110
    println(num)
    num = 1_233_333
    println(num)
    println()

    val n = 2.3f
    var nn: Double = 2.2
    println(nn)
    nn = 2.2e3
    println(nn)
    nn = 2.2e-3
    println(nn)
    println()

    var ch = 'k'
    println(ch)
    ch = 'f'
    val s = "Hello \"Gena\"!"
    println(s)
    val fff = true
    val ss = """
        Я вас любил
        Чего ещё же боле
    """.trimIndent()
    //Ниже что нужно добавить потому что у jet brains глюки.
    val writer = OutputStreamWriter(System.out, StandardCharsets.UTF_8)
    writer.write(ss)
    println()
    writer.flush()
    println("\n")
    var k = 23
    val kk = 2.9
    k += kk.toInt()
    println(k)
    var anyNum: Any = 2
    anyNum = k
    println(anyNum)
    anyNum = ss
    println(anyNum)

}