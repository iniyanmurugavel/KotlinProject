package kt.oops

fun main(args : Array<String>){

    /**
     * Enum is a datatype consisting of a set of named values called elements, members and enumeration of the type
     * An Enumeration is a kt.oops.user-defined data type that consist of integral constants
     * Why we should kt.enum actually?
     * we should always use kt.enum when a variable can only take one out of small set of possible values
     * Example - Good or Bad , Young or Old , Weak or Strong ,Male or Female ,Sad - Numb - Happy
     *
     */

    println(GameStatus.WON)
    println(GameStatus.LOSS)
    println(Feeling.Good)
    println(Feeling.Bad)

}
enum class GameStatus{
    WON,LOSS
}
enum class  Feeling{
    Good ,
    Bad
}
//
//Never stop learning
//        trust yourself
//        all things are possible
//        yes i can
//        think positive