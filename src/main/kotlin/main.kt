/**
 * @author 김재구 (jaegu.kim@navercorp.com)
 */

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x+y
}

fun multiply(x: Int, y: Int) = x * y

fun main(args: Array<String>) {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2,4))
}