package kt.conditional_statements

fun main(args:Array<String>){
    /**
     * Abstraction is a techinque for arranging complexity of computer systems.
     * It works by establishing a level of complexity on which o person interacts with the
     * systems, suppressing the more complex details below the current level
     * How abstraction is proceed
     * Abstraction is processed through hiding all but the relevant data about an object in order to reduce complexity
     * and increase efficiency
     *
     * Features of  Abstraction in Programming
     * Abstract classes cannot be instantiated
     * We can't create a object for kt.abstract
     * Abstract classes can be a subclassed
     * subclassed must provide implementation for all the kt.abstract methods of the super class (kt.abstract class )
     * a function contain body can't be kt.abstract
     * we can override the method from abbstract class with open keyword
     */
       var myClass= LionAbtClass()

   // var myabstractcls=conditionalstatements.AnimalClass() //can't create a instance of an kt.abstract class // kt.abstract class can't be instantiated
    // kt.abstract class be a subclass
    println(myClass.getSpeed())

}

class LionAbtClass : AnimalClass(){
    override fun getName(): String {
        TODO("Not yet implemented")
        return "LION"
    }
    fun getLionSpeed():Int{

        return getSpeed() // calling method from kt.abstract class not need to create a objectv
    }

    override fun getSpeed():Int{ // without open keyword in kt.abstract class can't overriden it will through error in compile time we encounter error in runtime animal class
       // is final cannot be overridden
        return 1000;
    }

    // conflict overloads
//     fun getSpeed():String{ // without open keyword in kt.abstract class can't overriden it will through error in compile time we encounter error in runtime animal class
//        // is final cannot be overridden
//        return "1000";
//    }

     override fun getValue(): String {
        TODO("Not yet implemented")
        return  "kt.abstract overrided method"
    }



}
abstract class AnimalClass{
    abstract fun getName():String

    /**
     * this method is final if we decleare before open keyword it can be override in concerete classes
     */
  open  fun getSpeed():Int {
        return  2000
    }

    abstract fun getValue():String
}

