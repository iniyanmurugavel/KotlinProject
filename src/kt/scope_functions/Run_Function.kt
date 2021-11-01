package kt.scope_functions

class Person(val firstName: String, val lastName: String) {
    var address: String = "unKnown"
    var phoneNumber: String = "Unknown"
    fun getInfo() = "first name $firstName \n $lastName \n address $address"
}

fun main() {

    /** See how more concise and readability of code using run run having context reference */
    val info = Person("iniyan", "arul").run {
        address = "tiruvannamalai"
        phoneNumber = "9894591650"
        getInfo()
    }

    println("show info data using run from class \n $info")
}