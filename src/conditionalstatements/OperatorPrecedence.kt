package conditionalstatements

fun main (args: Array<String>){


    // Precedence Rules
    /**
     * ()
     * ^
     * *,/
     * +,-
     */

    var myNumber =2 * 3 + 4 / 7 * Math.pow(2.0,3.0) -( 3 - 1)


    // 6
    //0  4/7 bother integer divide 0.5 consider s 0
    //2*2*2 =8
    //0*8 =0
    // 6 -2
    //4


    println(myNumber)



    var firstnumber :Int =1
    println(firstnumber)

    firstnumber =firstnumber +1 ;
    println("assign operator $firstnumber")
    firstnumber++
    println("post increment $firstnumber")
    firstnumber--
    println("post deincrement $firstnumber")
    ++firstnumber
    println("pre increment $firstnumber")
    --firstnumber
    println("pre deincrement $firstnumber")



    var secondNumber :Int =10
    var thirdNumber:Int =secondNumber++  // it will assign first original values to third number next it do increment
    println("check the increment values or not "+thirdNumber)
    println("incremented value" +secondNumber)

    thirdNumber = ++secondNumber
    println("thirdnumber incremented"+thirdNumber)



    var userName:String ?
    var passWord :String?
    userName= readLine()!!
    passWord= readLine()!!
    println("The oops.user with the username : "+userName +" \n"+
     "And the password :"+ passWord+" is  registered")

}