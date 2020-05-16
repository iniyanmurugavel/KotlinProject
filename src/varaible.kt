var score=100;

fun main(args:Array<String>){
    /**
     * Global variable is a varaible with global scope meaning (hence accessible throughout the program
     * Local variable is a varaible with local scope meaning with in given lifetime is limited to lifetime of its scope
     */

    var age :Int =32;
    age =25 ;
    score=200;
    println(score)


    var animalName:String ?=null
    var noOfCharacterAnimalName=animalName?.length?:100
    println("Print all the data $noOfCharacterAnimalName")
}