package kt.string_manipulations

fun main(args:Array<String>){

    /**
     * In kt.oops ,an extension method is a method added to an object after the original object was compiled
     * Why extensions
     * Extension methods allow code written by others to be extended
     * Extension methods allows features to be implemented once in ways that enable reuse
     * without the need for inheritance or interface
     *
     * With generic classes ,extension methods allow implementation of the behaviour that is available for all
     * instantiations of the generic types without requiring them to derive from a common base class
     *
     */


    var intArray =ArrayList<Int>()
    intArray.add(5)
    intArray.add(9)
    intArray.add(7)
    intArray.add(intArray.addTwoNumbers(intArray[0],intArray[1]))

    for(myarray in intArray)
        println(myarray)
}

fun ArrayList<Int>.addTwoNumbers(number1: Int ,number2:Int):Int  {
    var result=number1 + number2
    println(result)
  return  result
}
