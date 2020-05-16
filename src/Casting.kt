fun main(args :Array<String>){

    /**
     * What is casting
     * A cast is way of informing the compiler that you intend to make the conversion (converting Data type)
     * and that you are aware that data loss might occur
     * Why we use casting
     * Casting is simply allows you to convert an object of a particular data type and turning it into another object type
     * What is UpCasting - Casting to super type
     * Real world example - var myComputer :ComputerX =Nexus() // it a computer  it inherits from computer - upcasting converting datatype nexus from super type
     * It  automatically occurs
     * Down casting simply means casting to a sub classes
     * Real world example -  var myNexus nexus = ComputerX() as Nexus
     * It throws RuntimeException
     * It doesn't occurs automatically occurs
     *
     * important if you do downcasting we will get runtime exception ClassCastException
     */



    var myComputer:ComputerX=Nexus() // Upcasting -Automatically Occurs
    println(myComputer.computerX)

//var myNexus:Nexus= ComputerX() // compiler can't allow parent class to nexus type so we need to do downcasting computerx cannot cast to nexus

    /**
     * We will get RuntimeException and how to prevent this kind of extension
     * Exception in thread "main" java.lang.ClassCastException: ComputerX cannot be cast to Nexus
    at CastingKt.main(Casting.kt:24)
     */
    var myNexus:Nexus=ComputerX() as Nexus // DownCasting - Doesn't occurs
}

open class ComputerX(){
    var computerX:String ="Nexus "
}

class Nexus :ComputerX(){

}