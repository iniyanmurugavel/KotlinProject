package kt.innerclass

interface  Hero {
    fun saveCity()
}
fun main(args : Array<String>) {
    val spidy : Hero = object : Hero {
        override fun saveCity() {
            println("Spidy Saving City .. .from Kotlin ")
        }
    }
    spidy.saveCity()
}