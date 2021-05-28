/**
 * A data cannot have a blank constructor we will get an error and without var | val will throw error
 * We can provide atleast one value in the constructor . you can have a body and you can override the equals hash code
 * and toString functions if required
 * We cannot use before open, abstract before data class because all are final in data class implementatin
 * No need to override toString function in data class by default it will provide and same for equals functions also
 * you can inherit another class to your data class you can implement interface you can inherit  another class but
 * you can't inherit data class with another data class
 * use cannot use open keyword or abstract keyword with data keyword so these classes are final and you cannot
 * extends the data classes
 * data class is final
 * It is better than java and more concise less lines of code it have all basic things by default
 * All are properties in data class in kt
 * */
interface  dummy {
    val item : String
}
data class Person(
    val id : String,
    val firstname : String,
    val country : String,
    override val item: String // extends class or interface not another data classes
//    val _item : String
) : dummy {
    fun getName() = "$firstname and $country"
//    override val item: String
//        get() = _item
}

fun main() {
    val person = Person("1","Iniyan","India","test")
    val person1 = Person("1","Iniyan Arul","India","test")
    println("$person")
    println( person == person1)
    println(person.getName()) // own custom function create inside data class if required

    //ComponentN functions till the no of properties in data classes
    println(person.component1()) //1 means id
    println(person.component2()) //2 means firstname
    println(person.component3()) //3 means country
    // Why it is  componentN is useful
    // To get all values in vals in a single line
    val (id , firstname , country) = person // destructuring declaration
    println(id)
    println(firstname)
    println(country)

}