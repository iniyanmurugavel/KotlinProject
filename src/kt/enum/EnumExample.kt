package kt.enum

class EnumExample {


    fun main(args : Array<String>){

    }
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
