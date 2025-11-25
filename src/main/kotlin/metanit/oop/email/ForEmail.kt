package metanit.oop.email

class Message(val text: String)

fun send(message: Message, email: String) {
    println("На почту $email отправлено сообщение: ${message.text}")
}