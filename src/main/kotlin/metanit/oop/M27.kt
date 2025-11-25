package metanit.oop
import metanit.oop.email.send
import metanit.oop.email.Message as MyMessage

fun main() {
    val myMsg = MyMessage("Hello! I'm Vova! How are you?")
    send(myMsg, "Esldfj@gmail.com")
}

