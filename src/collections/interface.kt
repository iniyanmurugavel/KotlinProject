package collections

fun main(args:Array<String>){

    /**
     * An Interface is a programming structure to be enforced with on an object
     * Why we need Interface
     * Interface is better than class because we can define a single class that can be implement multiple interface
     * (Interface is more flexible than class )
     * We do not have to use inheritance , we can use interface . We can use Interface 
     *  An Interface is a contract between itself and any class that implements it..
     */
    var nexus= NexusClass()

    println(nexus.getCPUType() +"-"+nexus.getName()+"-"+nexus.getRam() )
}


/**
 * Multiples class can implement a interface
 */
interface ComputerInterface {
    fun getName():String
    fun getRam():Int
    fun getCPUType():String

}


class NexusClass : ComputerInterface {
    override fun getName(): String {
        TODO("Not yet implemented")
        return "iniyan"
    }

    override fun getRam(): Int {
        TODO("Not yet implemented")
        return 1024
    }

    override fun getCPUType(): String {
        TODO("Not yet implemented")
       return "Intel"
    }

}