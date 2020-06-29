package conditionalstatements

fun main(args:Array<String>) {

    /**
     * looping for loop for iterating
     */
    for (myNumber in 1..10) {
        println("Print my Number $myNumber")
    }


    /**
     *  for inside for nested for loop
     */
    for (myFirstNumber in 1..10) {
        println("first Number $myFirstNumber")
        for (mySecondNumber in 1..5) {
            println("Second Number == " + mySecondNumber)
        }
    }


    /**
     * While loop
     */
    var counter = 0;
    var isAllowUser: Boolean = true
    while (isAllowUser && counter < 5) {
        println("print while loop === $counter")
        counter++
    }

    /**
     * Do whileloop
     */
    var isTalkEnabled: Boolean = true
    var count = 0;
    do {
        println("Talk to all people connect")
        count++;
    } while (count < 5 && isTalkEnabled)


    /**
     *  Break Statements : Used for  break the loop
     *  Continue Statement : upto continue keyword it will work again it will start the process from first and it won't go next line after continue
     */
    for (myCheck in 1..5) {

        if (myCheck == 4) {
            break;
        }

        println("break statement print elements ==> $myCheck")
    }

    for(myCheckContinue in 1..10){
        if(myCheckContinue==4)
            continue
        println("Continue elements print $myCheckContinue")
    }


    /**
     * String
     * Getting  the name of something or someone from database
     *  sequence of character
     *  Accessing a specific character of a name  eg (animal name)
     *  Manipulating the string value
     */

    var stringValue :String = "My Lion"

    println("value of string== "+stringValue)
    println("uppcase string $stringValue")
    println("Lowercase String $stringValue")
    println("split function "+stringValue.split("M"))
    println("get index vakue "+ stringValue[0])

    /**
     * Varaible - variable is a memory location that stores  a value specific type
     * Each variable can hold only one item of data
     */

    /**
     * Array - An Array is a series of of memory location
     * each memory location can hold only one single item of data
     * All data in a array must be of the same data type
     * In array we always count from 0 index 0 ..
     * In array size can be fixed not able to extend an array

     */

    var partyNames = Array<String>(10){""}
    partyNames[0]="Iniyan"
    println("Array values === "+partyNames[0])
    println("Array values === "+partyNames[1])

    for (myValue in partyNames){

        println("values iterate" +myValue)
    }

    /**
     * Get data from oops.user and exclimetary !! 150 sure we are given proper data
     */
     for(myVar in 0..9){
         partyNames[myVar]= readLine()!!

         println("print read values added in array "+partyNames[myVar])
     }



}

