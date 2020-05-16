fun main(args:Array<String>){

    print("iniyanarul")

    println("ashok")

    var myplaceHolder ="iniyan values"

    print(myplaceHolder)
    var no=20
    print(no)


    //Single line command
    /*
    *hi
    * how are you
    * i'm fine
     */


    // Deferred varaible assign properly
    var myplace_var:String ="iniyan value"

    var integevalue_var:Int=10

    //const values

    //example
    myplaceHolder="xyz"
    integevalue_var=30

    println(myplaceHolder + "===" + integevalue_var)

    //constant values it wont change or later assign
    val myconstant="iniyan"
    // myconstant="ashok" // val cannot be reassigned


    println("======================optional start =========================")
    /*
    * optional provide later definition like if a val or var we change give ? optional options to placeholder is allowes null values or invalid values
    * if you not decleared ? while declearing in variable it will throw a error null not accepted is invalid
     */


    var option_dec:String?
    option_dec=null // accepts null becoz of optional
    option_dec="iniyan"

    print(option_dec)
    var check_val:Int
    //check_val=null // is invalid throws error and is not optional

    println("======================Concatenating String =========================")

    var age=20

    println("This is my age "+age)
    println("This is my age $age")

    println("======================Read input from user  String =========================")


    var ageinput = readLine();
    println("get inpit from user "+ageinput)

    //proper data getting based of deferred datatypes

    var integervalues= readLine()!!.toInt()

    println("integer values only alloweds=="+integervalues)

    var myDecimalVariable:Float =2.5f
    var myPreciousDecimalNumber=2.123456789040303
    println(myDecimalVariable)
    println(myPreciousDecimalNumber)

    var somevalue=10
    var doublevalue=somevalue.toDouble()
    println("Double value $doublevalue")

    // Null safety
    var myIntegerNumber :Int ?
      // myIntegerNumber=20;
   // println("my values null check "+ myIntegerNumber) // must be initialized
 // !!
    var myIntegerNumbernull:Int ?=null
    println("checking null values accepted or not "+myIntegerNumbernull) // but its print null
    // if we want to restrict invalid values from myintengerNumberNull
    // println("checks valid or invalid no "+myIntegerNumbernull!!) if the values null it will throw error  null pointer exception


    /**
     * Convert the datatypes
     */

    var myIntValues:Int =10
    var myIntValuestoString:String
    myIntValuestoString=myIntValues.toString()

    println("converted datatypes from int to string "+myIntValuestoString)


    var myStringValue="Something"
  //   var myconvertedStringvalue =myStringValue.toInt() it will throw numberformatexception because of string values is not valid no

    myStringValue="25"
    var myconvertedStringvalue=myIntValuestoString.toInt();

    println("Converted String to Int "+myconvertedStringvalue)


    var DoubleValuesInput:Double=myIntValues.toDouble()
    println("Converted Int to doubte "+DoubleValuesInput)



    //It will take the result is double if we use float the final result value
    println("Please enter the first number")
    var firstNumber :Double= readLine()!!.toDouble();

    println("Please enter the second Number")
    var secondNumber:Int= readLine()!!.toInt()

    var result=firstNumber * secondNumber
    println("Here is the result : "+result)




}