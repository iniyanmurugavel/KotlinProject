package kt.higherorderfunction

/**
 * Higher Level Functions
 * can accept Function as parameter
 * can a return function
 * or can do a both
 *
 * Lambdas
 * It just a function with no name 
 */
fun main(args: Array<String>) {
    val higherOrderFunctions = HigherOrderFunctions()
    val lambdaAction: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    higherOrderFunctions.addTwoNumber(7, 2, lambdaAction)
    higherOrderFunctions.addTwoNumber(7, 2) { x: Int, y: Int -> x + y } // alternative option
    higherOrderFunctions.addTwoNumber(7, 2, { x: Int, y: Int -> x + y }) // alternative option
}

class HigherOrderFunctions {

    fun addTwoNumber(a: Int, b: Int, actions: (Int, Int) -> Int) {
        val result = actions(a, b) // x+y = 2+7 = 9
        println(result)
    }

}