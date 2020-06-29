package collections

fun main(args : Array<String>){

    /**
     * Hashmap is a lot like a Array
     * The order of element in the collection is not guaranteed
     * Hashmap is used for storing key value pairs
     * The use get the data using key
     */


    // declearation
    var dictionary=HashMap<String,String>()
    dictionary.put("hello","Salutation")
    dictionary.put("nice","Beautiful")
    dictionary.put("fantastic","Gorgeous")
    dictionary.put("support","Backup")


    println(dictionary["hello"])

    println(dictionary["Hello"]) //null

    println(dictionary.get("nice")) // Beautiful
    println()
    println("All Keys")
    for(key in dictionary.keys){
        println("All the keys "+key)
    }

    println()
    println("All the values ")
    for(values in dictionary.values){
        println("All the values "+values)
    }


    //update the hashmap
    println()
    println("Updating hashmap")
    dictionary.put("hello","how are you ")
    println(dictionary["hello"])


    var hashmapIntKey =HashMap<Int,String>()
    hashmapIntKey.put(1,"k")
    var hashmapStringKey=HashMap<String,Int>()
    hashmapStringKey.put("K",1)


    // remove data by key
    dictionary.remove("nice")


    /**
     * Alternate way for making hashmap
     * previous decleration is traditional way of creating
     */

    var alternatewayHs= hashMapOf<Int,String>(1 to "iniyan",2 to "ashok senna",3 to "maddy")
    println()
    println("Alternate ways of hashmap using key "+ alternatewayHs[1])
    println("Alternate ways of hashmap using key "+ alternatewayHs.get(1))

    alternatewayHs.put(4 , "ashok sennan")

    alternatewayHs[1]="nirmala"

    for (myvar in alternatewayHs.values){

        println("Print all alternate values "+myvar)
    }

}