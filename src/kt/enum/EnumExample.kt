package kt.enum

/**
 * Enums in Kotlin to reperest a group of constants We can use Enum
 *
 */

interface DoColor {
    fun doColor()
}
enum class SColor {
    RED,
    GREEN,
    BLUE
}

enum class Day(val dayName: String) {
    Monday(dayName = "Monday"),
    Tuesday(dayName = "Tuesday"),
    Wednesday(dayName = "Wednesday")
}


/**
 * We can inherit a interface in enum class but enum not support abstract class or class
 */
enum class DayCheck(val dayName: String) : DoColor{
    Monday(dayName = "Monday") {
        override fun doColor() {
            println("Colored with Red")
        }

    },
    Tuesday(dayName = "Tuesday") {
        override fun doColor() {
            println("Colored with Yellow")
        }

    },
    Wednesday(dayName = "Wednesday"){
        override fun doColor() {
            println("Colored with Blue")
        }

    }
}


    fun main(args : Array<String>){
        SColor.values().forEach { println(it) } // To get all enum values from array format
        when(SColor.RED) {
            SColor.BLUE -> println("Blue")
            SColor.RED -> println("Red")
            SColor.GREEN -> println("Green")
        }

        println(Day.Monday.dayName)
        println(Day.Tuesday.dayName)

        println(DayCheck.Tuesday.doColor()) // using interface override in enum
    }


/*
Each kt.enum constant is an object. Enum constants are separated with commas.
 */
enum class Direction {
    NORTH,EAST,WEST,SOUTH
}


/*
Initialization
Since each kt.enum is an instance of the kt.enum class, they can be initialized as:
 */

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

/*
Anonymous Classes
Enum constants can also declare their own anonymous classes with their corresponding methods, as well as overriding base methods.
 */

enum class ProtocolType {
    WAITING {
        override fun signal() = TALKING

    } ,
    TALKING {
        override fun signal() = WAITING

    };

    abstract fun signal(): ProtocolType

}
