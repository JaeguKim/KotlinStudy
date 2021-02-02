/**
 * @author 김재구 (jaegu.kim@navercorp.com)
 */

fun printAll(vararg messages:String) {
    for (m in messages) println(m)
}

fun printlnAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

/*
At runtime, a vararg is just an array. To pass it along into a vararg parameter, use the special spread operator * that lets you pass in *entries (a vararg of String) instead of entries (an Array<String>).
*/
fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    printAll("Hello", "Hallo", "Salut","Hola","你好")
    printlnAllWithPrefix("Hello", "Hallo", "Salut","Hola","你好", prefix= "Greeting: ")
}


