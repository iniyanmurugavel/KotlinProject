package kt.invoke

/**
 * In object orientated programming singetlon object means single object when we want to singleton of a calss we use
 * this and when you have a object is very expensive to create and we use the object very frequently this case make singleton object
 * share throught project
 */

/*
Singelton object
 */
// we can instantiate our class
class Manager private constructor() {
    companion object {
        private var instance: Manager? = null

        // this code is not thread safe when two thread access the same function at the same time we may
        // have duplicate object to avoid this we use synchroized
        // instance of using this invoke operator well operator for invoke is called whenever we right it like this
        fun getInstance() = synchronized(this) {
            if (instance == null) {
                instance = Manager()
            }
            instance
        }

        operator fun invoke() = synchronized(this) {
            if (instance == null) {
                instance = Manager()
            }
            instance
        }
    }
}


// kt feature above is old way
object IManager {
      init {
          println("=========")
      }
}

fun main() {
    println(Manager.invoke())
    println(Manager())
    println(Manager.getInstance())
    println(Manager.getInstance())
}





/**
When we make a class object as singleton instance.
we use two approach in kotlin one is object  and companion.
In object doesn't not required any instance creation we can use directly access their block of code.

Using  companion object class we basically creating a instance object for that particular class.

For example :

fun getInstance() = synchronized(this) {
    if (instance == null) {
        instance = ExampleSingletonClass()
    }
    instance
}

Where is required in other place we generally calls

ClassName.getInstance() // this will return if already object is present else will create object newly


Kotlin provide feature for this approach
using this invoke operator without having any method name we can instantiate our object .

operator fun invoke() = synchronized(this) {
    if (instance == null) {
        instance = ExampleSingletonClass()
    }
    instance
}

You can use this method to access from other class
ClassName() // this will return singleton object - this is more concise
ClassName.invoke() // this will return singleton object
The above two method are same

here just we are not using any custom method to create a singleton object . Using this operator fun invoke also we are achieving the same behaviour
 **/

