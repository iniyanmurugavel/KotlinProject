package kt.collections

/**
 * filter - Filter our desired elements from a collection
 * map - perform operations, modify elements

 * predicates: or a condition that returns TRUE or FALSE
 * all - Do all elements satisfy the predicate/condition?
 * any - Do any element in list satisfy the predicate?
 * count - Total elements that satisfy the predicate
 * find - Returns the FIRST element that satisfy predicate

 *More functions:
 * flatmap - Filter elements from a Collection of collection
 * distinct - Returns unique results
 */
fun main(args : Array<String>) {

    val numberList : List<Int> = listOf(2,3,4,5,6,23,24,25)

    val mySmallNums : List<Int> = numberList.filter { it<10 } // OR { num -> num < 10 }
    for (num in mySmallNums) {
        println(num)
    }

    val mySquareNums = numberList.map { it * it } // OR { num -> num * num }
    for (num in mySquareNums) {
        println(num)
    }

    val mySmallSquareNum = numberList.filter { it < 10 }.map { it * it }
    for (num in mySmallSquareNum) {
        println(num)
    }

    var people = listOf<Person>(Person(10,"iniyan"), Person(15,"SugaPriya"), Person(20,"Sam"))
    val names = people.filter { it.name.startsWith("I") }.map { it.name }
    println("names $names")
    for (num in names) {
        println(num)
    }



    val myNumbers = listOf(2,3,4,5,6,23,98)
    val myPredicate = { num : Int -> num > 10 } // if we declare predicate in common without explicit without Int it will throw error
    // because not having any context
    val check = myNumbers.all(myPredicate) // Are all elements greater than 10? // returns true
    println(check)
    val check1 = myNumbers.any(myPredicate) // Does any of these elements satisfy the Predicate?
    println(check1)
    val totalCount : Int = myNumbers.count(myPredicate)
    val totalCountPredicate : Int = myNumbers.count { it > 10 }
    println(totalCountPredicate)
    println(totalCount)

    val num = myNumbers.find(predicate = myPredicate) // Returns the first that matches the Predicate
    val num1 = myNumbers.find{ it > 10}
    println(num)



    val namesList = listOf("Iniyan","SugaPriya","Thavamani","Murugavel","Prashanthini","Iniyan")
    val result = namesList.lastOrNull{ it.toLowerCase().contains("Ini")}
    val indexOfFirst = namesList.indexOfFirst{ it.toLowerCase().contains("Ini")}
    val indexOfLast = namesList.indexOfLast{ it.toLowerCase().contains("Ini")}
    val firstStart = namesList.firstOrNull{ it.toLowerCase().contains("Ini")}
    println("result $result")
    println("indexOfFirst $indexOfFirst")
    println("indexOfLast $indexOfLast")
    println("firstStart $firstStart")
}

class Person(var age:Int, var name: String) {
    // some other code ...
}