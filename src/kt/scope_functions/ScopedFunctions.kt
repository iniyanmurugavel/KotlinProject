package kt.scope_functions

/**
 * NOTE :
 * with : If you want to operate on non-null object
 * let - if you want to just execute lambda expression on nullable object and avoid NullPointerException
 * run - if you want to operate on nullable object , execute lambda expression and avoid NullPointerException (combination of with and let)
 * apply - if you want to initialize or configure an object
 * also - you can use also function if you want to do some additional object configuration
 *
 * apply,also will not return anything
 *
 * with - Return :  Lambda Result
 * Context object : this
 */

/**
 * let  - Return : Lambda Result
 * Context object : it
 */

/**
 * run  - Return : Lambda Result
 * Context object : this
 */

/**
 * apply - Return :  Context object
 * Context object : this
 */

/**
 * also - Return :  Context object
 * Context object : it
 */




//let prevelent also - return it
//apply prevelent run - returns this
//with - this same as run

class Person1 {
    var name : String = ""
    var age : Int = 0
}


class PersonImpl {
    var name : String = "Iniyan M"
    var age : Int = 26
}

fun main() {

    /**
     * Scope Function 'with'
     * Property 1 : Refer to context object by using 'this'
     * Property 2 : The return value is the lambda result
     */

    val person = PersonImpl()
    println(person.name)
    println(person.age)

    val ageAfterFiveYears : String =   with(person) {
        println(this.name) // options this remove all it will works internally it calls this
        println(age)
        age * 5
        "He is freak "
    }
    println("Age after five years is $ageAfterFiveYears")

    /**
     * Scope Function 'apply'
     * Property 1 : Refer to context object by using 'this'
     * Property 2 : The return value is the context object
     */
    val personResult  = Person1().apply {
        this.name = "Iniyan M" // options this remove all it will works internally it calls this
        this.age = 26
    }

    with(personResult) {
        println(name)
        println(age)
    }

    /**
     * Scope Function 'also'
     * Property 1 : Refer to context object by using 'it'
     * Property 2 : The return value is the context object
     */

    personResult.also {
     //also will not return anything
        it.name = "Iniyan"
        it.age = 26
    }



    /**
     * Scope Function 'let'
     */
    // let function to avoid nullpointerexception
    val name : String? = "Hello"
    // safecall operator ?. excecute only not null it will run
    name?.let {
        println(name.reversed()) // throws null pointer exception
        println(name.capitalize())
        println(name.length)
    }

    val stringLength = name?.let {
        println(name.reversed()) // throws null pointer exception
        println(name.capitalize())
        println(name.length)
        it.length
    }

    println(stringLength)


    /**
     * Run functions is a combination of with function and let function
     * If you want to operate on Nyllable object and avoid NullPointerException then use 'run'
     */

    val personRun  : PersonImpl? = PersonImpl()
    val bio = personRun?.run {
        println(name!!.reversed()) // throws null pointer exception
        println(name!!.capitalize())
        println(name!!.length)
    }
    println(bio)

    val numberList : MutableList<Int> = mutableListOf(1,2,3)

    val duplicationNumber = numberList.also {
        println("The list element are $it ")
        it.add(4)
        println("The list element after adding an element  $it ")
        it.remove(2)
        println("The list element after removing an element $it")
    }

    println("duplicationNumber $duplicationNumber")
}