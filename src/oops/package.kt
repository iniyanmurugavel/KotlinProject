package oops//package AnimalClasses

fun main(args:Array<String>){

    /**
     * Package is a namespace that organizes a set of related classes and interface
     * Package is a mechanism to encapsulate a group of classes , interfaces and sub packages
     * It is easy to organize class files into package
     */

    /**
     * Nested Classes
     * A nested class is a member of its enclosing class
     * Non static nested classes (inner classes )have access to other member of the enclosing class
     * even if they decleared as private . Static nested class do have access to other member of enclosing class
     *
     * Why we need ?
     * we use inner classes to logically group classes and
     * interface in one place so that it can be more readable and maintainable
     */

    var outerAnimal= OutsideAnimalClass()
    var nestedLion= OutsideAnimalClass.StaticLionClass()
    var innerTiger = OutsideAnimalClass().NonStaticTigerClass()
    innerTiger.printAnimalName()
    nestedLion.printAnimalName()
}

class OutsideAnimalClass(){
    private var animalName=""
    class StaticLionClass {
        fun printAnimalName(){
            //print(animalName) // static class cannot access member of enclusing classes
        }
    }

    inner class NonStaticTigerClass {

        fun printAnimalName(){

            print(animalName)
        }
    }
}