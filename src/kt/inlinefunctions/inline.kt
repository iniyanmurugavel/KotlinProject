package kt.inlinefunctions


/**
 * We can avoid the new function object creation  by using the inline Keyword
 * Now the called in byte code does not contain any new calls
 * Because of the inline keyword the compiler copies to the call site avoiding creating a new function object
 * if you are trying to mark as inline a function that doesnt accept another functions as a parameter  then you wont get
 * significant performance benefits and actually the id would even tell you that suggestion you to remove it
 *
 * Because inlining may cause the generated code to grow a lot make usre that you avoid inling the large functions
 * So for exampe the kotlin stadard library if you check code have only one or three in the function lines
 *
 * Inline functions not allowed to keep a reference to the functions passed as a paramter or pass it or a different function
 * you will get the compiler error saying illegal usage of inline parameter
 */

/**
 * add the inline keyword to improve the higher order function's performance.
 */
fun main() {
    Preference(true)
}

inline fun higherOrderFunction(aLambda: () -> Unit) {

//    doSomething()
//    aLamda()
//    doAnotherThing()

}

fun callingFunction() {

    higherOrderFunction{ print("lambda logic") }

}


fun sub(a : Int.()-> Unit) {
    a(10)
    println("$a")
}

//inline fun add(a : Int, b :Int) { // suggestion to remove
//     println("$a $b")
//}


fun myFunction(importantActions : Int.() -> Unit) {
    importantActions(-1)
}

/**
 * Inlining works best for functions with parameters of functional types
 * Expected performance impact
 * Case 1 : if you have multiple functions as parameters and you only need to keep a reference to one of them then you can
 * market it as no inline by using no inline the compile will create a new function objects only for that specific function but
 * rest will be inlined
 *
 * Case 2 :If you are function only has one function as parameter and you need to start with that reference so here
 * just prefer not using inline at all if you do add in line then you have then you mark your parameter with no inline but this
 * could cause low performance benefits by inlining the method
 *
 * To Summarize to decrease the memory allocation caused by lamba expressios use the inline keyword.Make sure you apply
 * to small functions that they call lambda as a parameter. if you need to keep a reference to a lambda or pass it as an
 * argument or another function use that no inline keyword
 */

// noinline ingore that particular line
// Inline functions not allowed to keep a reference to the functions passed as a paramter or pass it or a different function
inline fun Preference(commit : Boolean,
                      noinline _sub: Int.() -> Unit = {},
                      noinline  importantActions: Int.() -> Unit = {}){
    myFunction(importantActions)
    sub(_sub)
}