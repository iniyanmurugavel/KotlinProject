package kt.genericsandsignleton

/**
 * Generics is a powerful feature that you can use to define classess or functions that can work with different data types
 * T - Typed Parameter is not defined
 * A same class work with any datatype
 * Generic support for class and functions
 *
 *
 * List list = new ArrayList();
 * list.add("FirstString")
 * list.add(6) before java 5 no generic here we are restricting compiler to identify only to accept proper generic type
 * need to explicit cast, throws exception String str = (String) list.get(1) if you use generics not required any explicit type at runtime
 */




// To fix this problems to use Types in Generics  to use all datatype
//Normal Class
class ArrayUtils(private val array : Array<Int>) {
    fun findElement(element :Int ,foundElement  :(index : Int, element : Int?) -> Unit) {
        for(i in array.indices) {
            if(array[i] == element) {
                foundElement(i,array[i])
                return
            }
        }
        foundElement(-1,null)
        return
    }
}

// Normal Generic Classes
class GenericArrayUtils<T>(private val array : Array<T>) {
    fun findElement(element :T ,foundElement  :(index : Int, element : T?) -> Unit) {
        for(i in array.indices) {
            if(array[i] == element) {
                foundElement(i,array[i])
                return
            }
        }
        foundElement(-1,null)
        return
    }
}

// Based on Requirements we can create any no of types
class GenericMultipleArrayUtils<T,X>(private val array : Array<T>) {
    fun findElement(element :T ,foundElement  :(index : Int, element : T?) -> Unit) {
        for(i in array.indices) {
            if(array[i] == element) {
                foundElement(i,array[i])
                return
            }
        }
        foundElement(-1,null)
        return
    }
}


// Use generic in function to provide paramaters without fun<T>
fun<T> genericFindElement(array: Array<T>, element :T ,foundElement  :(index : Int, element : T?) -> Unit) {
    for(i in array.indices) {
        if(array[i] == element) {
            foundElement(i,array[i])
            return
        }
    }
    foundElement(-1,null)
    return
}


// multiple functions
fun<X,Y> justForTesting(param1 : X , param2 : Y) {
    println("$param1 and $param2")
}

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


    val arrayUtils = ArrayUtils(arrayOf(1,2,3,4,5))

    val arrayUtilsGenericInt = GenericArrayUtils<Int>(arrayOf(1,2,3,4,5))
    val arrayUtilsGenericString = GenericArrayUtils<String>(arrayOf("1","2","3","4","5"))

    // extra type if required to use
    val arrayUtilsGenericMultiple = GenericMultipleArrayUtils<Int,String>(arrayOf(1,2,3,4,5))

    genericFindElement(arrayOf(1,2,3,4,5),3){ index ,element ->
        println("Index $index")
        println("element $element")
    }

    arrayUtils.findElement(3) {
        index ,element ->
        println("Index $index")
        println("element $element")
    }

    justForTesting<String,Int>("3",5)

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