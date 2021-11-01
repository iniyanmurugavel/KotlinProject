package kt

/**
 * Java does not support default functions
 * Need to use @JvmOverloads for InterOperability
 */
fun main(args: Array<String>) {
    val result = findVolume(2, 3, 30) // overrides value
    val resultTest = findVolume(2, 3)
    println("result $result")
}

@JvmOverloads
fun findVolume(length : Int, breadth : Int, height : Int = 10) : Int {
    return length * breadth * height
}