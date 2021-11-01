package kt.collections

fun main(args: Array<String>) {
    val groceryBags = listOf(
        ShoppingBag(listOf("Grapes","Orange","Apple")),
        ShoppingBag(listOf("Milk","Eggs","Pasta")),
        ShoppingBag(listOf("Bread","Cake","chocholate"))
    )

    val retailBags = listOf(
        ShoppingBag(listOf("Shirts","Pants","Trousers")),
        ShoppingBag(listOf("Socks","shoes")),
        ShoppingBag(listOf("Jackets","Sweaters","Scrafs"))
    )

    val groceries = groceryBags.flatMap { it.items }
    println("groceries $groceries")

    val retailBagsInfo = retailBags.map { it.items }
    println("retailBagsInfo $retailBagsInfo")
}

class ShoppingBag(val items : List<String>)