package kt.collections

fun main(args :Array<String>){

    /**
     * why we go for list
     * ex Assume that you finally invite you friend name and you want to `String manipulations`.add to invite him/her to the party
     * what you are going to do
     * standard array are fixed in size or fixed length
     * Solution is ArrayList
     * ArrayList is all about dynamic arrays that can be extends as needed
     * set (3, "iiyan") -> is not adding it will update the list and same size it will replace data in a position
     * if oyu go with index start from 0 then size should be size - 1 or else it will through arrayoutofboundexception
     * get method start with 0 only to get the item in element
     * size be 4 and position will be 3
     */

    var listofArray =Array<String>(2){"0"}
    listofArray[0]="iniyan"

    var partyLists : List<String> = ArrayList<String>()
    // initialize the variable
    var partyList : ArrayList<String> = ArrayList<String>()
    partyList.add("John")
    partyList.add("Vanilla")
    partyList.add("Ashok")
    partyList.add("Priya")

    println("to get 3 element in list "+partyList.get(3))
    for(name in partyList){
        println("Print names  "+name)
    }


    partyList.set(3,"iniyan")
    println("check updated value"+partyList.get(3))
    for(printall in partyList){

        println("print all valiues == $printall")
    }

    // partyList.get(10)
    if(partyList.contains("thavamani"))
        println("Hi thavamani present in list")
    else
        println("Hi thavamani present not in list")


    println(" party list by index")
    for(index in 1..partyList.size-1){
        println("message iterated from index==>" + partyList[index])
    }


    /**
     * how to remove a element by value
     */
    partyList.remove("iniyan")
    println()
    for(myvalues in 0..partyList.size-1){

        println("removed values "+partyList[myvalues])

    }
    /**
     * how to removeat  by position
     */
    partyList.removeAt(2)
    println()
    for(myvalues in 0..partyList.size-1){
        println("removed values from by position "+partyList[myvalues])
    }


    /**
     * arrayOf - another way of creating array
     * arrayListOf - another way of creating arraylist
     * listof - another way for create list
     */
    /**
     * All the listOf all are by default is immutable and remaining are mutable
     *
     */

    println("========================arrayof==============================")
    var partyListof= listOf<String>("iniyan","ashok","pasupathi")
    var partyArrayList= arrayListOf<String>("iniyan","ashok","pasupathi")
    var partyArrayOf= arrayOf("iniyan","ashok","priya")

    println(partyList[1])
    partyArrayList.add("E")
    partyArrayList.remove("iniyan")
    partyArrayList.removeAt(2)
    partyArrayList[0]="ashok sennan";  // it wiil work
    //  partyListof[0]="something else" // will throw error because of immutable list

//    partyListof.`String manipulations`.add("ashok 3")
    for(myVar in partyArrayList)
        println(myVar)

    println("try to assign valiues to zeroth position to parrtyarraylist")

    /**
     * Mutuable listOf
     */

    var mutableListOf = mutableListOf<String>("Iniyan","Arul")
    mutableListOf[1]="santhosh"
    mutableListOf.add("ashok 3")
    mutableListOf.set(1,"veera")
    println(mutableListOf.get(1))




// read-only list
    val list=   listOf<String >() // creating a empty list
//   list[2]=4 immutable not able to change this feature
    val other :List<Int> = emptyList()  // type parameter is inferred the expected true
//    println(list.indexOf('b')) // 1 returns its index from list
//    println(list[2]) // c pass index to get the data
    println(list) // []
// list[0] //  will fail





    println("example of listOf and arrayOf")

    var myListOf = listOf<String>("iniyan","ashok")
    //  myListOf[1]="vetri" immutable not work
    println("sixe of arrayOf"+myListOf.size)

    for(myvar in myListOf){
        println("====element present $myvar")
    }

    println ()
    var myArrayOf = arrayOf("iniyan","ashok")
    myArrayOf[1]="vetri"
    println("sixe of arrayOf"+myArrayOf.size)

    for(myvar in myArrayOf){
        println("====element present $myvar")
    }

}