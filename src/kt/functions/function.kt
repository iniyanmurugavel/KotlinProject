package kt.string_manipulations

fun main (){


    createPost()
    showServerImage()
    /**
     * Some functions can return  value of specific type
     */
    var myOutput= multiply(5, 10)
    println(myOutput)


    /**
     *  More about functions
     */
    subtract(10, 5) // 5
    subtract()  //15 if your are not mentioned default value then you will get error while calling `String manipulations`.subtract method


    /**
     * function overrloading gives the programmer the permission to create  functions the conceptually perform the same thing on different  types of data
     */
    add(10, 20)


    /**
     * Polymorphism
     * The ability to present the same interface for different data types
     * extensively used in implementing in inheritance
     * Share same external interface with different internal structures
     */
    outPutTheArgument("iniyan")

    outPutTheArgument(10)
    outPutTheArgument(30.6544)

}

fun outPutTheArgument(s: String) {
    println("`String manipulations`.outPutTheArgument"+s)
}
fun outPutTheArgument(s: Int) {
    println("`String manipulations`.outPutTheArgument"+s)
}

fun outPutTheArgument(s: Double ) {
    println("`String manipulations`.outPutTheArgument"+s)
}

fun add ( a:Int  ,  b:Int):Int{
    return a+b;
}

fun add ( a:Int  ,  b:Int,c:Int) :Int{
    return a+b+c;
}

fun subtract(firstno: Int =20, secondnumber: Int =5 ) :Unit{

    println(firstno -secondnumber)
}

fun createPost(){  // useCamelCase

    println("Created a post ")
}


fun showServerImage(){  // useCamelCase

    println("show server image  a post ")
}

fun  multiply(firstNumber : Int , secondNumber :Int) :Int {
    return firstNumber * secondNumber
}



