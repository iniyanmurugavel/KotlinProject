package kt.inlinefunctions

import java.lang.IllegalStateException

/**
 * reified function can't able to access from java and inlining
 * refied also allowed overloading functions
 * refied is applied only in inline functions
 *
An inline function is one for which the compiler copies the code from the function definition
directly into the code of the calling function rather than creating a separate set of instructions in memory.
This eliminates call-linkage overhead and can expose significant optimization opportunities.
 */


inline fun <reified T> calculate(value : Float) : T {
    return when(T::class) {
        Float::class -> value as T
        Int::class -> value.toInt() as T
        else -> throw IllegalStateException("only works with Float and Int")
    }
}
fun main(args : Array<String>) {

    val intCall : Int = calculate(123643f)
    val floatCall : Float = calculate(123643f)
}