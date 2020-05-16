fun main(args :Array<String>){
    /**
     * Access Modifier determine whether other classes can be use particular field or invoke  a particular method
     * Why we use Access modifier
     * It allows the developers and programmers to control the accessibility of a specific variable or method
     * A variable that should not be accessed , it must not be accessed
     * Take a complete control of entire program
     *Public  Access Modifier
     * If a variable or function is decleared as public , it can be accessed from anywhere
     * Private Access Modifier
     * If a variable or function is decleared as private .  it can only accesses  with in the class
     * Protected Access Modifier
     * If a variable or function is decleared as protected . it can accessible with subclass and parent class
     */

    var myLion :Animal2 =Animal2()
    myLion.animalName="Lion" // we could access the name becaouse of public
  //  myLion.priv_animalName="Lion" // we could not accessible the name becaouse of private

}


class Animal2(){
    /**
     * Public is defalut access specifier for variable and function create or define inside a class or file
     * if you delete public keyword it is redudant
     */
     var animalName:String ?=null
   private var priv_animalName:String ?=null

}


class Computer(){
    private var computerName:String =""
}

open  class Person2 () {
 protected   var personName ="iniyan"
}

class Student():Person2(){

    fun changePersonName(){
        personName= "Ashok Sennan "
    }
}