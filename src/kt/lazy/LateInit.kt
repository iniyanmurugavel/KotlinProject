package kt.lazy

/**
 *  Use it with mutable variables [var]
 *  lateinit var name: String // Allowed
 *  lateinit val name: String // Not Allowed
 *  Allowed with only non-nullable data type
 *  lateinit var name : String // Allowed
 *  lateinit var name : String? //  Not allowed
 *  It is a promise to compiler that the vaule will be initialized in future
 *  Note : If you try to access lateInit variable without Initializing it then it throws
 *  UninitializedPropertyAccessException
 */
fun main(args : Array<String>) {

    // Safe Args
    val name : String? = null

    // Safe Args
    println("name ${name?.length}")

    // Safe Call with let (?.let)
    name?.let {
        println("The length of name is ${name.length}")
    }

    // Elvis Operator ?:
    val len = if(name != null) name.length
    else -1

    val length= name?.length ?: - 1

    // Assertion operator ( !! )
    // use it when you are sure the value is NOT NULL
}