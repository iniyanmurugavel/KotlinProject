/**
 * Higher Order Function
 * High Level Functions
 * can accept Functions as parameters
 * can return a functions
 * or can do this both
 */

/**
 * Lambda It is just a function without no name
 */


fun main(args : Array<String>) {
    val program = Program()
    program.addTwoNumber(2,7)
    program.addTwoNumber(2,7,object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })
    val lambda : (Int) -> Unit = { s : Int -> println(s) }
    program.addTwoNumber(2,7, lambda)
}

class Program {
    fun addTwoNumber(a : Int, b : Int, action : MyInterface) {
        val sum = a + b
        action.execute(sum)
        println(sum)
    }

    fun addTwoNumber(a : Int, b : Int) { // Simple way.. Just better Understanding
        val sum = a + b
        println(sum)
    }


    fun addTwoNumber(a : Int, b : Int , action : (Int) -> Unit) { // Simple way.. Just better Understanding
        val sum = a + b
        action(sum) // print and override s in this value in lambda
    }

}


interface MyInterface {
    fun execute(sum : Int)
}