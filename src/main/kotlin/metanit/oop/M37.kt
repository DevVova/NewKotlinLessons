package metanit.oop

/**
 * Делегирование представляет паттерн объектно-ориентированного программирования,
 * который позволяет одному объекту делегировать/перенаправить все запросы другому
 * объекту. В определенной степени делегирование может выступать альтернативой
 * наследованию. И преимуществом Kotlin в данном случае состоит в том, что Kotlin
 * нативно поддерживает данный паттерн, предоставляя необходимый инструментарий.
 *
 * Используется, когда класс должен реализовать интерфейс, но хочет поручить
 * реальную работу другому объекту.
 */
fun main() {
    val buy = OperationBuy(1)
    val sell = OperationSell(2)
    val myOperation1 = DoOperation("buy", buy)
    val myOperation2 = DoOperation("Sell", sell)
    myOperation1.doOperation()
    myOperation2.doOperation()
    println("Name myOperation2 is \"${myOperation2.nameOperation}\".")
    println()

    val fotick = FotoCamera("Canon")
    val audio = AudioDevice()
    val mySmartphone = Smartphone(fotick, audio)
    mySmartphone.doFoto()
    mySmartphone.doAudio()
}

interface OperationOfTrading {
    fun doOperation()
}

class OperationBuy(val lot: Int) : OperationOfTrading {
    override fun doOperation() {
        println("I'm buying with lot $lot.")
    }
}

class OperationSell(val lot: Int) : OperationOfTrading {
    override fun doOperation() {
        println("I'm selling with lot $lot.")
    }
}

class DoOperation(val nameOperation: String, outerOperation: OperationOfTrading) : OperationOfTrading by outerOperation


//Множественное делегирование.

interface Audio {
    fun doAudio()
}

interface Foto {
    val model: String
    fun doFoto()
}

class AudioDevice : Audio {
    override fun doAudio() {
        println("La-la-la")
    }
}

class FotoCamera(override val model: String) : Foto {
    override fun doFoto() {
        println("Chik-chik.")
    }
}

class Smartphone(f: Foto, a: Audio) : Foto by f, Audio by a {
    //Класс может переопределять часть функций интерфейса, в этом случае выполнение этих функций не делегируется.
    override fun doFoto() {
        println("Doing foto. Camera is $model.")
    }
}