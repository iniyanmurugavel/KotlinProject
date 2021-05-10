package kt.oops.constructor

/*
Secondary Constructors are written inside the body of the class by prefixing with the keyword constructor
 */
class Student {

    var name : String
    val  age : Int

    constructor(name: String , age : Int ) {
        this.name=name
        this.age=age
    }

    fun printDetails() {
        println("Name is $name and age is $age ")
    }
}

/*
Default constructor values
 */

class College (name :String = "iniyan" ,age: Int = 30){
    init {
        println("name is $name and age is $age")
    }
}

/*
primary constructor with secondary constructor
 */



class Admin (var name: String ,var age : Int) {
    var skill :String
    init {
        skill ="NA"
    }
    constructor(name: String,age: Int,skill: String) : this(name,age){
        this.skill=skill
    }
}

/*
private constructor with secondary constructor
 */
class samplePrivateConst private constructor(var name: String){
    var skill:String
    init {
        skill="NA"
    }
    constructor(name: String, skill: String) : this(name = name){
        this.skill= skill
    }
}
fun main(){
    val student = Student("iniyan", 24)
    student.printDetails()

    val college = College("ashok", 23)
}