package Generics

fun main (args :Array<String>)
{
    /**
     * Generic Programming is a style of computer programming in which algorithms are written in terms of types to be
     * specified -later  that are  then instantiated  when needed for specific types provided as paramaters
     *
     * Why Generic Programming
     * Code that uses generics has many benefits over non-generic code
     * Stronger type check at compile time
     * Java compilers applies strong type checking to generic code and issues errors inside if the code violates type
     * safety
     * Fixing compiler-time error is easier than fixing error in runtimes error , which can be difficult to find.
     *
     */


    var myAnimal= GenericAnimalClass("Lion")
}

/**
 * T is generic
 * We can pass any Type
 */
class GenericAnimalClass<T>(kind:T){
    init {
        println(kind)
    }
}