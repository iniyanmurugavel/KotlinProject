package kt.oops

fun main(args :Array<String>){

    /**
     * Method Overriding
     * IN kt.oops Method overriding is a language feature that allows a subclass to provide a specific implementation
     * of the method that is already provided by one of its superclasses or parent classes
     * Why Overriding
     *  The ability of subclasses to override a method allows  a class to inherit from a superclass  whose behaviour is close
     *  enough and then to modify behaviour as needed . Overriding is only exclusive to InHeritance

     */

    var animalx= AnimalX();
    animalx.fight()

    var tiger= Tiger();
    tiger.fight()

}

/**
 * Here opne keyword for making inheritance to provide data to derived class
 */
open class AnimalX(){
    /**
     * Allow to override in derived classes
     */
   open fun fight(){
        println("kt.oops.AnimalX is fighting")
    }

}
class Tiger: AnimalX(){

    override fun fight() {
        //super.fight()   // it will calls parent method 
        println("kt.oops.Tiger is fighting")
    }
}