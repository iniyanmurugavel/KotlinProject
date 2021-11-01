package kt.collections

/**
 *  functions has some limitations also(when used normally). Think of a situation, where you want the name and age
 *  of a particular student of a college, then if you want to use the function approach
 *  then you can return only one value at a time. If you want to return more than one value
 *  for different data type (in our example, name is of string type, while age is of type integer),
 *  then you have to make use of dummy class where you can declare all the variables that you want to
 *  return from the function and after that make an object of the class and
 *  collect the returned value in some List.
 *
 *
 *  But the problem here is that if you are having so many things to do i.e.
 *  so many functions to work on which returns more than one value then you have to make a separate class for all those functions and finally use that class.
 *  This will be a very complex and lengthy approach.
 *
 *  Pair
 *  Pair is a predefined class in Kotlin that is used to store and return two variables at a time.
 *  Those two variables can be of the same type or of a different type.
 *
 *  Triple
   Triple is another predefined class in Kotlin. With the help of Triple class in Kotlin, you can return 3 variables of same or different type from one function.
   Also, you can use Triple class to store 3 variables of same or different type.
 */
fun main(args : Array<String>) {
    Pair ("Hello", "Kotlin") // here both the variables are of type string
    Pair ("Kotlin", 1) // here 1st variable is of type string and other is type of integer
    Pair (2, 20) // here both the variables are of integer type

    val variable1 = "Declaring String variable"
    val variable2 = 1 // declaring integer value

    Pair (variable1, variable2) // using declared variable in Pair class

    val variableName = Pair (variable1, variable2) // using declared variable in Pair class

    println(variableName.first) // will print the value of variable1
    println(variableName.second) // will print the value of variable2

    val(firstVariable, secondVariable) = Pair("Hello", 1)
    println(firstVariable)
    println(secondVariable)

    // Infix
    val (url: String, website: String) = getWebsite()
    println(url)
    println(website)

    print(variableName.toString()) // toString() is a function that is used to convert the variables of the pair into string and use that variables as string.
    val list = variableName.toList() // toList() function converts the Pair variable in form of List i.e. you can use the Pair variables just like List items.
    println(list[0]) // this will print the value of variable1
    println(list[1]) // this will print the value of variable2


    val variable3 = "Declaring second string value"

    val variableNameTriple = Triple (variable1, variable2, variable3) // using declared variable in Triple class

    println(variableNameTriple.first) // will print the value of variable1
    println(variableNameTriple.second) // will print the value of variable2
    println(variableNameTriple.third) // will print the value of variable3
}

fun getWebsite() : Pair<String, String> {
    return "www.google.com" to "the Website is"
}
