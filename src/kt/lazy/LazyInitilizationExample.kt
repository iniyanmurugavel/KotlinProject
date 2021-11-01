package kt.lazy

/**
 * Lazy initialization was designed to prevent unneccessary initialization of objects
 *  your varaible will not be initialized unless you use it your code
 *  It is initialized only once. Next time when you use it. you get the value from cache memory
 *  It is a thread safe
 *  It is initialized in the thread where it is used for the first time
 *  Other threads use the same value stored in the cache
 *  The variable can be var or val
 */

val pi : Float by lazy {
    3.14f
}
fun main(args : Array<String>) {
    println("Some initial code....")

    val area1 = pi * 4 * 4
    val area2 = pi * 4 * 4
    println("Some more code ....")
}