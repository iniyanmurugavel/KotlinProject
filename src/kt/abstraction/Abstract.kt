package kt.abstraction

/*
An kt.abstract class cannot be instantiated, which means we cannot create the object of an kt.abstract class.
 Unlike other class, an kt.abstract class is always open so we do not need to use the open keyword.

Points to Note:
1. We cannot create the object of an kt.abstract class.
2. Property and member function of an kt.abstract class are by default non-kt.abstract.
If you want to override these in the child class then you need to use open keyword for them.
3. If a member function is kt.abstract then it must be implemented in the child class.
 An kt.abstract member function doesn’t have a body only method signature, the implementation is done in the child class.
 */

/*
Abstract classes are by default open. So adding an open modifier to allow subclassing isn’t required.
 */

/**
 * The role of abstract class is just provide set of methods and properties
 * Abstract classess are partially defined a class
 * Abstract method does not contain body  when decleared
 * Abstract property cannot be initialized when decleared
 * you cannot create instance/object of abstract class
 * you need to dervie override method from abstract classes
 */
 abstract class Student(name :String , age :Int) {
    init {
        println("name is $name")
        println("age is $age")
    }

    fun demo() {
        println("non kt.abstract method")
    }

    abstract fun func(message : String)
}


class College(name: String,age: Int)  : Student(name, age){
    override fun func(message: String) {
        println("override college func method ")
    }

}

fun main() {
    val obj = College("iniyan", 24)
    obj.func("hi iniyan")
    obj.demo()
}

//
//open class Person() {
//    abstract fun eat1() // abstract properties are "open" by default
//    open fun eat() {}
//    open fun getHeight() {} // A open function ready to overriden
//    fun goToSchool() { // A Normal Function: public and final by default
//    }
//}



abstract class Person() {
    open var name : String = "dummy_name" // normal flow
    abstract var nameCheck: String // can't be declare
    abstract fun eat1() // abstract properties are "open" by default
    open fun eat() {}
    open fun getHeight() {} // A open function ready to overriden
    fun goToSchool() { // A Normal Function: public and final by default
    }
}

class Indian() : Person() { // Sub class or Derived class
    override var name: String = "dummy_indian_name" // override flow
    override var nameCheck: String = "iniyan arul"
    override fun eat1() {

    }

}