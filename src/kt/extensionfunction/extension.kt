package kt.extensionfunction

/**
 * A extension function is used in exisiting classes or classess without derving new classes or without following
 * any design patters so it very cool feature right so far the sake of example
 */
fun main() {
    val a : String = "How are you"
    val words = a.getAllWords() // it a part of string class but it a class are called extension class
    println(words)
}


fun String.getAllWords() : List<String> {
    return this.split(" ")
}