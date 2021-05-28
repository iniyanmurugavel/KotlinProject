package kt

/**
 * without inner class
 */
class Box(val width :Int , val height :Int , val length:Int ) {

 class Content(val content :String){

     fun printContent() {
         println(content)
     }

     fun printBoxInfo(){
//         println("$width $height $length") // whenever you access outerclass member inside inner class need to add inner class
     }
 }

}


/**
 * With inner class it will take reference from outerclass to inside inner class
 */

class Box1(val width :Int , val height :Int , val length:Int ) {

    inner class Content(val content :String){

        fun printContent() {
            println(content)
        }

        fun printBoxInfo(){
          println("$width $height $length") // whenever you access outerclass member inside inner class need to add inner class
        }
    }

}


fun main() {


    // When you have a class inside a class we need to access
    val contentInstance = Box.Content("Some Content")
    contentInstance.printContent()

    val box = Box(10,10,10)
    //val content1 = box.printContent() we cannot access from the instance of the box but we can access class name inside content printmethod


   // val content = Box1.Content("extra content") // we cannot access from only class name with direct access not possible but
    val box1 = Box1(10,10,10) // outer class
    val content1 = box1.Content("some text") // outer class reference with inner class access
    content1.printBoxInfo()
    content1.printContent()
}