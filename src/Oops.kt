fun main(args : Array<String>){

    /**
     * Flow of the program is top to bottom
     * Object oriented Programming everything is seen as objects
     * Car objects what is model of the car , speed of car , power of car
     * Reuseable cdoes and Recycling
     * Encapsulation knowledge of the information of specific
     * We apply oops to build larger program can be easily done
     * last does not least software maintainence is easy
     */

    /**
     * Classes
     * A class is a blue print that show to how to create  a object
     * ex car - object inside some attributes the blueprints shows the attritubes
     *  model of car and no of wheels
     *  In class we are not using camelCase in Declearing class name
     */


    /**
     * Creating Object from Classes
     * Each Object you create it has its own properties
     */

     var myCar : car=car() // decleare or call the class with paranthesis

    myCar.name="iniyan arul"
    println("mycar "+myCar.name)


    var yourcar : car=car();

    yourcar.power=200;
    println("your car  "+yourcar.power) // property of the yourcar is differet from mycar object because it has own property


    println(car().numberOfWheels) // new object created with own property here we are not assigning


}

class car {

    /**
     * Attribute of the car object
     * These all declearation are the properties of the car objects
     */
    var speed :Int =0  // property must be intialized in abstract
    var power=0; // compiler will inferred the type of object

    var name =""
    var numberOfWheels:Int =0
}