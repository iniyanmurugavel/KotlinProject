package kt.oops

fun main(args:Array<String>){
    /**
     * Why we use super
     * It is used inside a sub-class method definition to call method defined in the super class
     * super features
     * Only public and protected method only call by the super keyword
     * It can also used class constructor of its parent class
     */

    /**
     * What is this
     * Object of specific type
     * Mostly we use this in order to explicitly refers to an instance variable
     */

    var myKickBoxer: KickBoxer = KickBoxer(100, 200, 10)
    myKickBoxer.fight()

    println(myKickBoxer.kickPower)

    println(myKickBoxer.kickSpeed)
}


open class Boxers(numberOfWons:Int){
    var punchSpeed:Int =0
    var punchPower:Int=0

    /**
     * if it is private we can't access from derived class
     */
    fun throwPunch(){
        println("The kt.oops.constructor.Boxer is throwing a punch ")
    }
}

/**
 * If you declare custom constructor inside derived class with empty paranthesis of parent class
 * we need to remove the kt.oops.Boxers() to kt.oops.Boxers in class declearation
 */
//class kt.oops.KickBoxer:kt.oops.Boxers(){
//class kt.oops.KickBoxer:kt.oops.constructor.Boxer{ // then super won't work because of no parent constructor
class KickBoxer: Boxers {
    var kickSpeed :Int =0
    var kickPower:Int=0
    fun fight(){
        super.throwPunch()
        println("The kt.oops.KickBoxer is Fighting ")
    }

    /**
     * this is used for same class with primary constructor with custom constructor call of the same class
     * super(with values) passing values to parent primary constructor when defining custom constructor with derived classes
     * No need to decleare with parenthisis with derived class declearation like kt.oops.Boxers() in kickboxers
     */
    constructor(kickSpeed:Int,kickPower:Int,numberOfWons: Int) : super(numberOfWons){
        this.kickPower=kickPower
        this.kickSpeed=kickSpeed

        println(numberOfWons)
    }
}