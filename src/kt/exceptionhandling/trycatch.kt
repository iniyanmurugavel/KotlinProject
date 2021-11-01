package kt.string_manipulations

import java.lang.Exception

fun main (args :Array<String>) {
    /**
     * the try catch block contain set of statement where an exception can occur . A try block is always followed by
     * catch block , which handles the exception that occurs in associated try block
     * What does catch block do
     * A catch block is where the exception are handled. A single try block can have multiple or several catch block
     * associated with it. Different exceptions can caught in different catch blocks
     * when exception occurs in try block the corresponding catch block that handles the particular exceptions executes
     *
     *
     * Why try and catch block required
     * if the code that is error prone is not wrapped in a try catch block, the program will automatically shutdown asap
     * the error is thrown .we should always use try /catch around any code or method that can throw an error
     *
     *
     */
    println("Enter the data input integer")
    try {
        var input = readLine()!!.toInt()
        println("input $input")
    } catch (myexception: Exception) {
        myexception.printStackTrace()
        println("My Exception Trance" + myexception.message)
    }
}