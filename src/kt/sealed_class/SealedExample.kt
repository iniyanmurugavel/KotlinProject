package kt.sealed_class


/**
 *
Sealed classes in Kotlin are another new concept
A sealed class allows you to represent constrained hierarchies in which an object can only be of one of the given types.
will allow objects from a sealed class to keep state.
The difference is that in the kt.enum we only have one object per type, while in the sealed classes we can have several
objects of the same class.
This difference will allow objects from a sealed class to keep state.
sealed classes are sealed or closed, hence making them restricted.
Sealed classes are used for representing restricted class hierarchies wherein the object or the value can have value
only among one of the types, thus fixing your type hierarchies.
Sealed classes are commonly used in cases, where you know what a given value to be only among a given set of options.
is modifier is required only for classes. Not with Kotlin objects  and modifier checks if the class is of the following type
 */


sealed class SealedExample {


    class B : SealedExample()
    {
        class E : SealedExample() //this works.
    }
    class C : SealedExample()

    init {
        println("sealed class A")
    }

}

/**
Constructors of a sealed class are private by default.
All subclasses of a sealed class must be declared within the same file.
Sealed classes are important in ensuring type safety by restricting the set of types at compile-time only.
A sealed class cannot be instantiated. Hence, are implicitly kt.abstract.
 */


fun main(args: Array<String>)
{
//    var a = SealedExample() //compiler error. Class A cannot be instantiated.
    var circle = Shape.Circle(4.5f)
    var square = Shape.Square(4)
    var rectangle = Shape.Rectangle(4,5)

    eval(circle)
    eval(square)
    eval(rectangle)

}



/*
A sealed class is kt.abstract by itself, it cannot be instantiated directly and can have kt.abstract members.
Sealed classes allow us to create instances with different types, unlike Enums which restrict us to use the same type for all kt.enum constants.
Enum classes allow only a single type for all constants.
 */
enum class EnumMonths(string :String){
    January("Jan"),
    February("Feb") // if we use different type will get error
}

/*
sealed classes come to our rescue by allowing multiple instances.
 */
sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
    object shapes :Shape() {
        var length:Int = 0
        var breath : Int = 0
    }
}


data class demo(var name: String) : Shape()
/*
Sealed classes and when
Sealed classes are commonly used with when statements since each of the subclasses and their types act as a case.
 Moreover, we know that the Sealed class limits the types. Hence, the else part of the when statement can be easily removed.
  // the `else` clause is not required because we've covered all the cases
 */

fun eval(e: Shape) = when (e) {
    is Shape.Circle -> println("Circle area is ${3.14*e.radius*e.radius}")
    is Shape.Square -> println("Square area is ${e.length*e.length}")
    is Shape.Rectangle -> println("Rectagle area is ${e.length*e.breadth}")
    Shape.shapes -> println("Object ${Shape.shapes.breath}")
    is demo -> println("demo branch")
}