package kt.oops

fun main(args: Array<String>) {


    /**
     * In kt.oops  inheritance enables new object to take on the properties of existing objects
     * we can call super class or base class
     * A class that inherits from superclass is a subclass or derived class
     * Why we use inheritance
     * kt.oops.constructor.Animal have a attributes for every animal , cat is also an animal ,
     * it inheritance from animal and it has its own properties
     */


    var myPerson = Person();
    myPerson.name = "iniyan"

    println("My kt.oops.Person " + myPerson.name)


    var myStudent = student() //is a realtionship can access the all properties of baseclass
    myStudent.name = "ashok "
    myStudent.StudentId = 1234567
    println("My kt.oops.Student " + myStudent.name)
    println("My kt.oops.Student " + myStudent.StudentId!!)

    var myEmployee = Employee() //is a realtionship can access the all properties of baseclass
    myEmployee.name = "ashok "
    myEmployee.employee = 1234567
    println("My myEmployee " + myEmployee.name)
    println("My myEmployee " + myEmployee.employee!!)
}

/**
 * It will provide inherit features
 */
open class Person() {

    var name: String? = null
    var age: Int? = null
    var height: Int? = null // optional
}

class student() : Person() { // inherits from person class
    // kt.oops.Person class by default is final how to change the situation
    // if you use make class open then you can make inheritance from person
    // kt.oops.student class get all the properties from person class
    // we no need to define the all the attributies form person class


    var StudentId: Int? = null
}

class Employee() : Person() {

    var employee: Int? = null
}