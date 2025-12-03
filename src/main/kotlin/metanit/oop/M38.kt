package metanit.oop

/**
 * Иногда возникает необходимость создать объект некоторого класса,
 * который больше нигде в программе не используется. То есть класс
 * необходим только для создания только одного объекта. В этом случае
 * мы, конечно, можем, как и обычно, определить класс и затем создать
 * объект этого класса. Но Kotlin для таких ситуаций предоставлять
 * возможность определить объект анонимного класса.
 */
fun main() {
    val o = AnyObject
    o.info()
    val newName = AnyObject.name
    println(newName)

    val s = SuperObject
    s.info()

    val ss = object : Object1("SS") {}
    ss.info()
    println()

    //Анонимный объект как аргумент функции
    getObjectName(object : Object1("Vova") {
        override fun info() {
            super.info()
            println("Good job!")
        }
    })
    getObjectName(SuperObject)

    //Анонимный объект как результат функции
    val o1 = createObject("O1")
    println(o1.objectName)
    val o2 = createObject("O2")
    println(o2.objectName)
}

object AnyObject {
    var name = "Object"

    fun info() {
        println("This is an object.")
    }
}

object SuperObject : Object1("SuperObject")

open class Object1(val name: String) {
    open fun info() {
        println("The objects name is $name.")
    }
}

fun getObjectName(objectAA : Object1) {
    objectAA.info()
}

private fun createObject(nameIn: String) = object {
    val objectName = nameIn
}