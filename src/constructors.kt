fun main (args : Array<String>){

    /**
     * Constructors
     * A constructor is a block of code that gets executed whenever an object of class is created
     */
      var myBoxer=Boxer("iniyan",100,200) // they must pass the these values required object is created after calling init method


    /**
     * Custom constructor
     * Whenever we create custom constructor we need to call primary constructor call expected or else it will throw error
     *
     */
    var animal=Animal(5000)
    /**
     * Calling custom constructor
     */
    var customanimal =Animal("My Lion","yellow",2000,3000)
}

class Boxer (name :String ,power :Int ,speed : Int ){
    // inside paranthesis is a primary constructor

    /**
     * Instance variable
     */
    private var name:String =""
    private var power:Int?=null  //optional variable
    private var speed: Int =0

    /**
     * The moment the boxer class intialized with required values
     * this block of code
     * we get the name from constructor
      */

    init  {
        this.name=name  // this refers to object of type boxer class or  instance varialbe
        println(name + "-" + power+ "-"+ speed )
    }

    fun getName():String {
        return this .name;

    }
}


/**
 * Output of the class
 * first you call custom or normal call for this class object
 * it will call intial with primary constructor
 * next it will print custom constructor
 * init call before constructor method
 * but if we call primary constructor it will execute the custom constructor from parent class 
 */
class Animal (power: Int){
    init {
        println("Animal Init $power")
    }

    /**
     * It will not show error before compiler
     * After compile you will get primary constructor call is expected
     */
//    constructor(name: String,color:String,speed: Int,power: Int){
//        println(name + "-"+ color + "-" + speed +  "-" + power)
//    }

    /*
    this keyword use for passing values to primary constructor in kotlin
     */
    constructor(name: String,color:String,speed: Int,power: Int) : this(5000){
        println(name + "-"+ color + "-" + speed +  "-" + power)
    }
}