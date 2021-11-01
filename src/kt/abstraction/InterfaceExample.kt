package kt.abstraction

/**
 * Interface can contains both Normal methods and abstract methods
 * You cannot create instance of an interface similar to abstract
 *
 */
fun main(args: Array<String>) {
    val btn = InterfaceExample("iniyan")
    btn.onTouch()
    btn.onClick()
}

// Whatever declare in interface is abstract and open in nature
// Incase of interface nothing is final
interface MyInterfaceListener { // you cannot create instance of abstract class

    abstract var name: String // should not contain a default value it should be a empty value

    public open fun onClick() { // Normal method are public and open by default NOT Final
        // your code
        println("MyInterfaceListener")
    }

    abstract fun onTouch()
}

interface MySecondInterfaceListener { // you cannot create instance of abstract class

    abstract var name: String // should not contain a default value it should be a empty value

    public open fun onClick() { // Normal method are public and open by default NOT Final
        // your code
        println("MySecondInterfaceListener")
    }

    fun onTouch() {
        println("Hi iniyan arul")
    }
}

class InterfaceExample(override var name: String) : MyInterfaceListener, MySecondInterfaceListener {

    override fun onClick() {
      //  super.onClick() // throw error compiler not able to find which interface need to call
        super<MyInterfaceListener>.onClick() // To resolve to call parent click
    }

    override fun onTouch() {
        super.onTouch()
       // println("onTouch")
    }

}