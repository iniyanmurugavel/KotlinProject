package kt.scope_functions


/** Scopes functions are functions that executes a block of code in context  of an object
Scope function creates a temporary scope inside which you access the object as it or this

1. let
2. run
3. also
4. apply
5. with


it            this

return result                let            run


return same object           also           apply
 **/


fun main() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)


    /** no need to use variable and it will return all data
     * to perform some operation use let */
    numbers.filter { it.length > 3 }.map { it }.let {
        println(it)
    }

    val nullableString: String? = null
    /** concise **/
    nullableString?.let {
        println(it)
    }

    if (nullableString == null) {
        println(nullableString)
    }

}