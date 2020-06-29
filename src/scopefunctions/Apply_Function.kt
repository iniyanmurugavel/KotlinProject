package scopefunctions

import `String manipulations`.add

class Persons(val firstName:String,val lastName:String ){
    var address:String ="unKnown"
    var phoneNumber:String="Unknown"
    fun getInfo()= "first name $firstName \n $lastName \n address $address"
    override fun toString(): String {
        return "$address and $phoneNumber"
    }
}

fun main(){

    /** See here how many time we are using here person reference for each update
    val person=Persons("iniyan","arul")
    person.address="xxxx"
    person.phoneNumber="9894591650"
     */

    /** run is transform a object where it is a apply to return the same statement
    let and run called transformer whereas apply return same statement all object  which we applying on it */
    val person=Persons("iniyan","arul").apply {
     // this.address="Hi madam" we can use this also not required
        address="Hi madam"
        phoneNumber="9894591650"
        getInfo() // if we write last statement it is not printing it will take only first priority as toString method
    }


    println("show info data using run from class \n $person" )
}