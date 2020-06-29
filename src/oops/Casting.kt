package oops

fun main(args :Array<String>){

    /**
     * What is casting
     * A cast is way of informing the compiler that you intend to make the conversion (converting Data type)
     * and that you are aware that data loss might occur
     * Why we use casting
     * Casting is simply allows you to convert an object of a particular data type and turning it into another object type
     * What is UpCasting - Casting to super type
     * Real world example - var myComputer :oops.ComputerX =oops.Nexus() // it a computer  it inherits from computer - upcasting converting datatype nexus from super type
     * It  automatically occurs
     * Down casting simply means casting to a sub classes
     * Real world example -  var myNexus nexus = oops.ComputerX() as oops.Nexus
     * It throws RuntimeException
     * It doesn't occurs automatically occurs
     *
     * important if you do downcasting we will get runtime exception ClassCastException
     */



    var myComputer: ComputerX = Nexus() // Upcasting -Automatically Occurs
    println(myComputer.computerX)

//var myNexus:oops.Nexus= oops.ComputerX() // compiler can't allow parent class to nexus type so we need to do downcasting computerx cannot cast to nexus

    /**
     * We will get RuntimeException and how to prevent this kind of extension
     * Exception in thread "collections.oops.Generics.oops.conditionalstatements.collections.`String manipulations`.oops.`String manipulations`.conditionalstatements.`String manipulations`.main" java.lang.ClassCastException: oops.ComputerX cannot be cast to oops.Nexus
    at CastingKt.collections.oops.Generics.oops.conditionalstatements.collections.`String manipulations`.oops.`String manipulations`.conditionalstatements.`String manipulations`.main(Casting.kt:24)
     */
    var myNexus: Nexus = ComputerX() as Nexus // DownCasting - Doesn't occurs
}

open class ComputerX(){
    var computerX:String ="oops.Nexus "
}

class Nexus : ComputerX(){

}