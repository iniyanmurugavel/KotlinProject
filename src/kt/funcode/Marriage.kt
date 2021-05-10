package kt.funcode

fun main (args : Array<String>) {
    do {
        askForMarriage("XXXX")
        val answer = readLine()!!
    } while (!hasAccepted(answer))
}

fun askForMarriage(name: String){
    println("$name, would you marry me?")
}

fun hasAccepted(answer :String) : Boolean {
    println("Wow XXXX Said Yes :)")
    return answer.toUpperCase() == "YES"
}