fun main(args:Array<String>){
    /**
     * In software engineering the singleton pattern is a software design pattern that restricts the instantiation of
     * a class to one object. In object oriented programming a singleton class is a class that can have only one
     * object at a time
     *
     * Singleton is useful when the exactly one object is needed to coordinate action across system
     * Singleton is used to design the classes which provides configuration setting for an application
     */

    var mySamsungGalaxy= SamsungGalaxy.instance
    mySamsungGalaxy.name="My Samsung"
    println(mySamsungGalaxy.name)

    var yourSamsungGalaxy=SamsungGalaxy.instance
    println(yourSamsungGalaxy.name) // it print same object 
}
class SamsungGalaxy{
    var name :String ="Galaxy S8"

    /**
     * We must provide private keyword to the constructor
     * because if you don't specify the constructor everytime a new object will be created
     */
    constructor(){
        println("$name is created")
    }


    /**
     * static
     * lazy means a object of the class created only once and everytime the reference all going to created to this instance
     * no other object will  be created
     */
    companion object {
        val instance :SamsungGalaxy by lazy { SamsungGalaxy() }
        //Everthing the instance is sent back
        // This instance  is created only once
    }
}