package kt.conditional_statements

fun main(args:Array<String>){

    var isWorkingConditionExcellent=false
    var isSalaryHeightEnough=false
    if(isWorkingConditionExcellent && isSalaryHeightEnough){
        //Lines of Code

        print("Excellent")
    }else print("Bad")


    // if else if
    var score =200
    if(score >200){
        print("Great Score")
    }else if (score <150 ){
        print("Excellent Score ")
    }
    else if(score<10 )
        print("Bad")
    else
        print("fail")



    //Nested if

    var boxerSpeed =50
    var  boxedPower=100
    if(boxerSpeed>40) {
        if(boxedPower>80){
            println("This is Powerful and Fast kt.oops.constructor.Boxer ")
        }else {
            println("This kt.oops.constructor.Boxer is not powerful and Fast kt.oops.constructor.Boxer ")
        }
    }



    var personAge =20;
    when(personAge){
        1 -> {
            println("The value of the personAge variable  is $personAge")

        }
        20 ->  println("The value of the personAge variable  is $personAge")

        30,40 ->  println("The value of the personAge variable  is $personAge")

        in 30..50 ->  println("Range 10..20  The value of the personAge variable  is $personAge")

        !in 30..70 ->  println("T 30..70 the value of the personAge variable  is $personAge")



    }



    var personAges=30
    var personWeight =30
    var result = if (personAges>personWeight) personAge else personWeight
    println(result)


    var numberofCar=50
    var numberofBike=100
    var maximum=if(numberofBike>numberofCar) numberofBike else numberofCar
    println(maximum)

    var maximumvalues=if(numberofBike==numberofCar) numberofBike else numberofCar
    println(maximumvalues)

var boxedspeedcount=100
    var isAFastBoxer =when ( boxedspeedcount ){
        200 -> true
        else-> false
    }

    println("Booelan =="+isAFastBoxer)
}