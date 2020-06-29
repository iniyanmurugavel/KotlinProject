package collections

fun main(args:Array<String>){


    /**
     * Set is a another collection type  that holds a distinct objects
     * immutable listOf
     * In set we can `String manipulations`.add / delete and update operation not mentioned
     */
    /**
     * Need to understand the serialization and
         * Stringfy methods
     */

    var animalNames = mutableListOf<String >("Lion","Panther","Cat","oops.Tiger","Lion")

//    animalNames[0]="ashok"  it will throw error immutable
    // animalNames[2]="elephant"  because of immutable
    println()
    println("Mutable setOf")
    // All seralized data only it will generate
    var mutanimalNames = mutableSetOf<String>("Lion","Panther","Cat","oops.Tiger","Lion")
    mutanimalNames.add("ashok sennan")
    mutanimalNames.contains("ashok") // to check present or not in set
    println()

    for(list in mutanimalNames){

        println(" list of data $list")
    }


}